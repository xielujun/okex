package com.cp.okex.bean.future.hq;

public class FuturePriceLimit {
	
	/**
	 * 最高买价
	 */
	private Double high;
	/**
	 * 最低卖价
	 */
	private Double low;
	
	public Double getHigh() {
		return high;
	}
	public void setHigh(Double high) {
		this.high = high;
	}
	public Double getLow() {
		return low;
	}
	public void setLow(Double low) {
		this.low = low;
	}
	
	@Override
	public String toString() {
		return "FuturePriceLimit [high=" + high + ", low=" + low + "]";
	}
	
}
