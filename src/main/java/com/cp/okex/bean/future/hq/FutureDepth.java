package com.cp.okex.bean.future.hq;

import java.util.List;

public class FutureDepth {
	
	/**
	 * 卖方深度
	 */
	private List<Double[]> asks;
	/**
	 * 买方深度
	 */
	private List<Double[]> bids;
	
	
	public List<Double[]> getAsks() {
		return asks;
	}
	public void setAsks(List<Double[]> asks) {
		this.asks = asks;
	}
	public List<Double[]> getBids() {
		return bids;
	}
	public void setBids(List<Double[]> bids) {
		this.bids = bids;
	}
	
	
	@Override
	public String toString() {
		return "FutureHQDepth [asks=" + asks + ", bids=" + bids + "]";
	}
	

}
