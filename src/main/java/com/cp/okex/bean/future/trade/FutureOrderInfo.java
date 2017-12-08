package com.cp.okex.bean.future.trade;

import java.util.List;

public class FutureOrderInfo {
	
	/**
	 * 合约订单详情
	 */
	private List<FutureOrderInfoDetail> orders;
	/**
	 * 返回结果
	 */
	private Boolean result;
	
	public List<FutureOrderInfoDetail> getOrders() {
		return orders;
	}
	public void setOrders(List<FutureOrderInfoDetail> orders) {
		this.orders = orders;
	}
	public Boolean getResult() {
		return result;
	}
	public void setResult(Boolean result) {
		this.result = result;
	}
	
	@Override
	public String toString() {
		return "FutureOrderInfo [orders=" + orders + ", result=" + result + "]";
	}
	
}
