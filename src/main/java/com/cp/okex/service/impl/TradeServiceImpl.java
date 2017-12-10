package com.cp.okex.service.impl;

import com.cp.okex.api.FutureTrade;
import com.cp.okex.api.impl.FutureTradeImpl;
import com.cp.okex.bean.future.trade.FutureTradeDetail;
import com.cp.okex.enums.ContractType;
import com.cp.okex.enums.LeverRate;
import com.cp.okex.enums.MatchPrice;
import com.cp.okex.enums.Symbol;
import com.cp.okex.enums.TradeType;
import com.cp.okex.service.TradeService;
import com.cp.okex.util.DateUtils;

public class TradeServiceImpl implements TradeService {
	
	private Symbol symbol;
	private ContractType contractType;
	private Integer amount;
	private LeverRate leverRate;
	
	/**
	 * 初始化交易服务
	 * @param symbol		币种标识
	 * @param contractType	合约类型
	 * @param amount		下单数量
	 * @param lever_rate	杠杆倍数
	 */
	public TradeServiceImpl(Symbol symbol, ContractType contractType, Integer amount, LeverRate leverRate) {
		this.symbol = symbol;
		this.contractType = contractType;
		this.amount = amount;
		this.leverRate = leverRate;
	}

	@Override
	public Long trade(Double price, TradeType tradeType) {
		MatchPrice matchPrice = price==null?MatchPrice.对手价:MatchPrice.非对手价;
		FutureTrade futureTrade = new FutureTradeImpl();
		FutureTradeDetail futureTradeDetail = null;
		Long tradeId = null;
			do {
				try {
					futureTradeDetail = futureTrade.futureTrade(symbol, contractType, price, amount, tradeType, matchPrice, leverRate);
					tradeId = futureTradeDetail.getOrder_id();
				} catch (Exception e) {
					System.out.println(String.format("[%s]下单失败[%s][%s,%s,%s,%s,%s,%s,%s]", DateUtils.getCurrentDate(), e.getMessage(), symbol, contractType, price, amount, tradeType, matchPrice, leverRate));
				}
			} while (tradeId==null || tradeId<=0);
		return tradeId;
	}

	@Override
	public Long trade(TradeType tradeType) {
		return trade(null, tradeType);
	}

}
