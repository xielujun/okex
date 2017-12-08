package com.cp.okex.bean.future.hq;

public class ExchangeRate {
	
	/**
	 * 美元-人民币汇率
	 */
	private String rate;

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "ExchangeRate [rate=" + rate + "]";
	}
	
}
