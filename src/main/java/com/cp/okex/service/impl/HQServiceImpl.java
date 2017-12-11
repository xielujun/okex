package com.cp.okex.service.impl;

import com.cp.okex.api.FutureHQ;
import com.cp.okex.api.impl.FutureHQImpl;
import com.cp.okex.bean.future.hq.FutureDepth;
import com.cp.okex.bean.future.hq.FutureTicker;
import com.cp.okex.enums.ContractType;
import com.cp.okex.enums.Merge;
import com.cp.okex.enums.Symbol;
import com.cp.okex.service.HQService;
import com.cp.okex.util.DateUtils;

public class HQServiceImpl implements HQService {
	
	/**
	 * 获取行情的频率
	 */
	private Long frequency = 1000l;
	
	/**
	 * 买一价
	 */
	private Double buy = 0.0;

	/**
	 * 卖一价
	 */
	private Double sell = 0.0;
	
	/**
	 * 合并深度后的买一价
	 */
	private Double mergeBuy = 0.0;
	
	/**
	 * 合并深度后的卖一价
	 */
	private Double mergeSell = 0.0;
	
	/**
	 * 初始化行情服务
	 * @param symbol		币种
	 * @param contractType	合约类型
	 * @param frequency			获取行情的频率
	 */
	public HQServiceImpl(Symbol symbol, ContractType contractType, Long frequency) {
		this.frequency = frequency;
		runGetHQ(symbol, contractType);
		runGetMergeHQ(symbol, contractType);
	}
	
	
	private void runGetMergeHQ(Symbol symbol, ContractType contractType) {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				FutureHQ hq = new FutureHQImpl();
					while(true) {
						try {
							mergeBuy = 0d;
							mergeSell = 0d;
							FutureDepth futureDepth = hq.futureDepth(symbol, contractType, 1, Merge.合并);
							if(futureDepth!=null && futureDepth.getBids()!=null && futureDepth.getBids().size()>0 && futureDepth.getAsks()!=null && futureDepth.getAsks().size()>0) {
								mergeBuy = futureDepth.getBids().get(0)[0];
								mergeSell = futureDepth.getAsks().get(0)[0];
							}else {
								throw new Exception("返回结果为空.");
							}
							Thread.sleep(frequency);
						} catch (Exception e) {
							System.out.println(String.format("[%s]获取合并后的行情失败[%s]", DateUtils.getCurrentDate(), e.getMessage()));
						}
					}
			}


			
		}).start();
		
	}


	private void runGetHQ(final Symbol symbol, final ContractType contractType) {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				FutureHQ hq = new FutureHQImpl();
					while(true) {
						try {
							buy = 0d;
							sell = 0d;
							FutureTicker futureTicker = hq.futureTicker(symbol, contractType);
							if(futureTicker!=null && futureTicker.getTicker()!=null) {
								buy = futureTicker.getTicker().getBuy();
								sell = futureTicker.getTicker().getSell();
							}else {
								throw new Exception("返回结果为空.");
							}
							Thread.sleep(frequency);
						} catch (Exception e) {
							System.out.println(String.format("[%s]获取行情失败[%s]", DateUtils.getCurrentDate(), e.getMessage()));
						}
					}
			}


			
		}).start();
	}
	

	@Override
	public Double getBuy() {
		return buy;
	}


	@Override
	public Double getSell() {
		return sell;
	}


	@Override
	public Double getMergeBuy() {
		return mergeBuy;
	}


	@Override
	public Double getMergeSell() {
		return mergeSell;
	}


}
