package com.cp.okex.bean.future.hq;

public class FutureTicker {
	
	/**
	 * 时间戳
	 */
	private Long date;
	/**
	 * 合约行情详情
	 */
	private FutureTickerDetail ticker;
	
	public Long getDate() {
		return date;
	}
	public void setDate(Long date) {
		this.date = date;
	}
	public FutureTickerDetail getTicker() {
		return ticker;
	}
	public void setTicker(FutureTickerDetail ticker) {
		this.ticker = ticker;
	}
	
	@Override
	public String toString() {
		return "FutureTicker [date=" + date + ", ticker=" + ticker + "]";
	}
	
}
