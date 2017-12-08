package com.cp.okex.bean.future.hq;

import java.util.List;

public class FutureKline {
	
	/**
	 * K线数据
	 * 时间戳
	 * 开
	 * 高
	 * 低
	 * 收
	 * 交易量
	 * 交易量转化BTC或LTC数量
	 */
	private List<Object[]> kline;

	public List<Object[]> getKline() {
		return kline;
	}

	public void setKline(List<Object[]> kline) {
		this.kline = kline;
	}

	@Override
	public String toString() {
		return "FutureKline [kline=" + kline + "]";
	}
	
}
