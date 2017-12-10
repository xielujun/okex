package com.cp.okex.service.impl;

import com.cp.okex.api.FutureHQ;
import com.cp.okex.api.impl.FutureHQImpl;
import com.cp.okex.bean.future.hq.FutureTicker;
import com.cp.okex.enums.ContractType;
import com.cp.okex.enums.Symbol;
import com.cp.okex.service.HQService;
import com.cp.okex.util.DateUtils;

public class HQServiceImpl implements HQService {
	
	/**
	 * 获取行情的频率
	 */
	private static final Long FREQUENCY = 1000l;
	
	/**
	 * 买一价
	 */
	private Double buy = 0.0;

	/**
	 * 卖一价
	 */
	private Double sell = 0.0;
	
	
	/**
	 * 初始化行情服务
	 * @param symbol
	 * @param contractType
	 * @param freq
	 */
	public HQServiceImpl(Symbol symbol, ContractType contractType) {
		runGetHQ(symbol, contractType);
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
							Thread.sleep(FREQUENCY);
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


}
