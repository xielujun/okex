package com.cp.okex.stry;

import com.cp.okex.api.FutureTrade;
import com.cp.okex.api.impl.FutureTradeImpl;
import com.cp.okex.bean.future.trade.FutureCancel;
import com.cp.okex.bean.future.trade.FutureOrderInfo;
import com.cp.okex.bean.future.trade.FutureOrderInfoDetail;
import com.cp.okex.bean.future.trade.FutureTradeDetail;
import com.cp.okex.enums.ContractType;
import com.cp.okex.enums.LeverRate;
import com.cp.okex.enums.MatchPrice;
import com.cp.okex.enums.Symbol;
import com.cp.okex.enums.TradeType;
import com.cp.okex.service.HQService;
import com.cp.okex.service.impl.HQServiceImpl;

/**
 * 跟K线策略
 * @author Administrator
 *
 */
public class FollowKLineStry implements BaseStry {
	
	/**
	 * 行情服务，用来获取行情
	 */
	private HQService hq = null;
	
	/**
	 * 合约交易API
	 */
	private FutureTrade futureTrade;
	
	/**
	 * 币种标识
	 */
	private Symbol symbol = null;
	
	/**
	 * 合约类型
	 */
	private ContractType contractType = null;
	
	/**
	 * 交易方向
	 */
	private TradeType tradeType = null;
	
	/**
	 * 现成交价格
	 */
	private Double strikePrice = 0.0;
	
	
	/**
	 * 原成交价格
	 */
	private Double rStrikePrice = 0.0;
	
	/**
	 * 调整价
	 * 不可能再指定的价格卖出
	 */
	private Double adj = 2d;
	
	/**
	 * 交易数量
	 */
	private Integer amount = 0;
	
	/**
	 * 杠杆倍数
	 */
	private LeverRate leverRate = null;
	
	/**
	 * 订单ID
	 */
	private Long orderId = null;
	
	/**
	 * 撤销订单标识
	 */
	private Boolean cancel = false;
	
	/**
	 * 价格波动阈值，超过阈值则切换交易
	 */
	private Double range = 0.0;
	
	/**
	 * 行情频率
	 */
	private Long frequency = 1000l;
	
	 
	
	
	/**
	 * 实例化跟线策略
	 * @param symbol		币种
	 * @param contractType	合约类型
	 * @param amount		交易量-单次
	 * @param leverRate		杠杆倍数
	 * @param range			涨跌限制，如果开空涨过了该限制则切换交易，如果开多跌过了该限制则切换交易
	 * @param frequency		获取行情的频率
	 */
	public FollowKLineStry(Symbol symbol, ContractType contractType, Integer amount, LeverRate leverRate, Double range, Long frequency) {
		this.symbol = symbol;
		this.contractType = contractType;
		this.amount = amount;
		this.leverRate = leverRate;
		this.range = range;
		this.frequency = frequency;
		//启动行情服务
		hq = new HQServiceImpl(symbol, contractType, frequency);
		//实例化交易API
		futureTrade = new FutureTradeImpl();
	}

	@Override
	public void run() {
		
		if(tradeType==null) {
			//获取交易方向
			getTradeDirection();
		}
		
		//启动交易
		startTrade();
	}
	

	private void startTrade() {
		//下单
		Boolean flag = true;//标识是否下单成功
		do {
			
			//判断是否需要撤单
			if(cancel) {
				try {
					FutureCancel FutureCancel = futureTrade.futureCancel(symbol, contractType, orderId);
					System.out.println(String.format("撤单结果[%s]", FutureCancel.getResult()));
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				cancel = false;
			}
			//设置交易价格
			setStrikePrice();
			System.out.println(String.format("获取到的最新交易价格[%s]", strikePrice));
			
			try {
				FutureTradeDetail futureTradeDetail = null;
				//发起交易
				if(tradeType==TradeType.平多||tradeType==TradeType.平空) {
					//平仓时获取订单的最新可平数量，防止部分成交后平仓失败的情况
					FutureOrderInfo futureOrderInfo = futureTrade.futureOrderInfo(symbol, contractType, null, orderId, 1, 1);
					if(futureOrderInfo!=null && futureOrderInfo.getOrders().size()>0) {
						FutureOrderInfoDetail futureOrderInfoDetail = futureOrderInfo.getOrders().get(0);
						futureTradeDetail = futureTrade.futureTrade(symbol, contractType, strikePrice, futureOrderInfoDetail.getAmount(), tradeType, MatchPrice.非对手价, leverRate);
					}
				}else {
					futureTradeDetail = futureTrade.futureTrade(symbol, contractType, strikePrice, amount, tradeType, MatchPrice.非对手价, leverRate);
				}
				orderId = futureTradeDetail.getOrder_id();
				if(orderId!=null) {
					System.out.println(String.format("交易[%s%s]下单成功", tradeType, strikePrice));
					int count = 0;
					//获取订单状态
					do {
						if(count==10) {
							System.out.println(String.format("交易[%s%s]10次未成交,撤单,调整成交价重新下单", tradeType, strikePrice));
							//10次未成交则撤单重新下单
							cancel = true;
							break;
						}
						try {
							FutureOrderInfo futureOrderInfo = futureTrade.futureOrderInfo(symbol, contractType, null, orderId, 1, 1);
							if(futureOrderInfo!=null && futureOrderInfo.getOrders().size()>0) {
								FutureOrderInfoDetail futureOrderInfoDetail = futureOrderInfo.getOrders().get(0);
								if(futureOrderInfoDetail.getStatus()==2) {
									System.out.println(String.format("交易[%s%s]成交", tradeType, strikePrice));
									flag = false;//下单成功调处循环--下一步监控订单
									break;
								}
							}
						}catch (Exception e) {
							System.out.println(e.getMessage());
						}
						
						count++;
						stopForTime(frequency);
					} while (true);
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			//控制下单频率
			if(flag) {
				stopForTime(frequency);
			}
		} while (flag);
		
		
		//监控订单
		monitorOrder();
	}
	
	/**
	 * 设置交易价格
	 * 开多则取最新的买一价加上调整的价格
	 * 开空则取最新的卖一价减去调整的价格
	 * 平多则取最新的卖一价减去调整的价格
	 * 平空则取最新的买一价加上调整的价格
	 */
	private void setStrikePrice() {
		Boolean flag = true;
		do {
			Double buy = hq.getBuy();
			Double sell = hq.getSell();
			if(buy==0 || sell==0) {
				stopForTime(frequency);
				continue;
			}
			switch (tradeType) {
				case 开多:
					strikePrice = buy+adj;
					flag = false;
					break;
				case 开空:
					strikePrice = sell-adj;
					flag = false;
					break;
				case 平多:
					strikePrice = sell-adj;
					flag = false;
					break;
				case 平空:
					strikePrice = buy+adj;
					flag = false;
					break;
				default:
					break;
			}
			rStrikePrice = strikePrice;
		} while (flag);
	}

	/**
	 * 监控成交的订单价格是否正在盈利，如果盈利则继续盈利，如果亏损则判断是否在亏损的接受范围内，若已经超出承受范围则平仓发起相反方向的交易
	 * 首先排除未获取到行情的情况
	 * 交易方向如果是开多的情况则判断买一价是否大于成交价，如果大于说明在涨在盈利，继续盈利，并且把最新的买价作为成交价
	 * 如果小于成交价说明在跌，这个时候需要判断跌的幅度是否在可接受的范围，如果跌的幅度超过了范围则切换交易，开多相反的
	 * 方向是平多
	 * 交易方向如果是开空则判断最新的卖一价是否小于开空的价格，如果是则说明在跌在盈利，继续盈利，并且把最新的卖一价做为成交价
	 * 如果当前的卖一价大于成交价说明在涨在亏损，这个时候需要判断涨的幅度是否超过了可以承受的范围，如果超过了则切换交易
	 * 
	 * 如果交易方向是平多则说明行情看空，发起开空的新交易
	 * 如果交易方向是平空则说明行情看多，发起开多的新交易
	 */
	private void monitorOrder() {

		Boolean flag = true;
		do {
			
			//最新的买一价
			Double buy = hq.getBuy();
			//最新的卖一价
			Double sell = hq.getSell();
			
			if(buy==0||sell==0) {
				System.out.println("最新价获取失败");
				continue;
			}
			
			
			switch (tradeType) {
			case 开多:
				//判断买一价是否上涨
				if(buy>strikePrice) {
					strikePrice = buy;//最高价保存为成交价
					System.out.println(String.format("开多涨了,最高买价保存为现成交价[%s]", strikePrice));
				}else if(buy<strikePrice) {
					//跌了,判断是否在可以接受的范围
					if(strikePrice-buy>range) {
						System.out.println(String.format("开多跌了超过阈值,原成交价[%s]最新价[%s]现成交价[%s]差额[%s]阈值[%s]", rStrikePrice, buy, strikePrice, strikePrice-buy, range));
						stopForTime(frequency*5);
						if(hq.getBuy()>0 && strikePrice-hq.getBuy()>range) {
							System.out.println(String.format("二次判断同样超过阈值,原成交价[%s]最新价[%s]现成交价[%s]差额[%s]阈值[%s]", rStrikePrice, buy, strikePrice, strikePrice-hq.getBuy(), range));
							//切换交易
							tradeType = TradeType.平多;
							System.out.println(String.format("切换交易为[%s]", tradeType));
							flag = false;
						}else {
							System.out.println(String.format("二次判断未超过阈值,原成交价[%s]最新价[%s]现成交价[%s]差额[%s]阈值[%s]", rStrikePrice, buy, strikePrice, strikePrice-hq.getBuy(), range));
						}
					}else {
						System.out.println(String.format("开多跌了未超过阈值,原成交价[%s]最新价[%s]现成交价[%s]差额[%s]阈值[%s]", rStrikePrice, buy, strikePrice, strikePrice-buy, range));
					}
				}
				break;
			case 开空:
				//判断卖一价是否下跌
				if(sell<strikePrice) {
					strikePrice = sell;//最低价保存为成交价
					System.out.println(String.format("开空跌了,最低卖价保存为现成交价[%s]", strikePrice));
				}else if(sell>strikePrice) {
					//涨了,判断是否在可以接受的范围
					if(sell-strikePrice>range) {
						System.out.println(String.format("开多涨了超过阈值,原成交价[%s]最新价[%s]现成交价[%s]差额[%s]阈值[%s]", rStrikePrice, sell, strikePrice, sell-strikePrice, range));
						stopForTime(frequency*5);
						if(hq.getSell()>0 && hq.getSell()-strikePrice>range) {
							System.out.println(String.format("二次判断同样超过阈值,原成交价[%s]最新价[%s]现成交价[%s]差额[%s]阈值[%s]", rStrikePrice, sell, strikePrice, hq.getSell()-strikePrice, range));
							//切换交易
							tradeType = TradeType.平空;
							System.out.println(String.format("切换交易为[%s]", tradeType));
							flag = false;
						}else {
							System.out.println(String.format("二次判断未超过阈值,原成交价[%s]最新价[%s]现成交价[%s]差额[%s]阈值[%s]", rStrikePrice, sell, strikePrice, hq.getSell()-strikePrice, range));
						}
					}else {
						System.out.println(String.format("开空涨了未超过阈值,原成交价[%s]最新价[%s]现成交价[%s]差额[%s]阈值[%s]", rStrikePrice, sell, strikePrice, sell-strikePrice, range));
					}
				}
				break;
			case 平多:
				System.out.println("当前交易平多成功,则重新开空");
				//切换交易
				tradeType = TradeType.开空;
				flag = false;
				break;
			case 平空:
				System.out.println("当前交易平空成功,则重新开多");
				//切换交易
				tradeType = TradeType.开多;
				flag = false;
				break;
			default:
				break;
			}
			
			stopForTime(frequency);
			
		} while (flag);
		
		
		//发起交易
		run();
	
	}

	/**
	 * 第一次进入程序先看行情确定交易方向
	 * 先保存一个行情价，过1秒获取新行情，如果新行情大于就行情说明上涨则开多，否则相反，如果是相等则等下一次获取
	 */
	private void getTradeDirection() {
		//获取交易价格
		Double buy = 0.0;
		Double sell = 0.0;
		do {
			stopForTime(frequency);
			buy = hq.getBuy();
			sell = hq.getSell();
		} while (buy==0||sell==0);
		
		//获取交易方向
		do {
			
			stopForTime(frequency);
			//排除没有获取到行情的情况
			if(hq.getBuy()==0) {
				break;
			}
			if(hq.getBuy()>buy) {
				tradeType = TradeType.开多;
			}else if(hq.getBuy()<buy) {
				tradeType = TradeType.开空;
			}
			
		} while (tradeType==null);
	}
	
	private static void stopForTime(Long time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}


}
