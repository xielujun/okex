package com.cp.okex.service;

import com.cp.okex.enums.TradeType;

public interface TradeService {
	
	/**
	 * 指定价格下单
	 * @param price		价格
	 * @param tradeType	交易类型
	 */
	Long trade(Double price, TradeType tradeType);
	
	/**
	 * 以对手价下单
	 * @param tradeType	交易类型
	 */
	Long trade(TradeType tradeType);

}
