package com.cp.okex.bean.future.trade;

public class FutureTrade {
	
	/**
	 * 订单ID
	 */
	private Long order_id;
	/**
	 * 返回结果
	 */
	private Boolean result;
	
	public Long getOrder_id() {
		return order_id;
	}
	public void setOrder_id(Long order_id) {
		this.order_id = order_id;
	}
	public Boolean getResult() {
		return result;
	}
	public void setResult(Boolean result) {
		this.result = result;
	}
	
	@Override
	public String toString() {
		return "FutureTrade [order_id=" + order_id + ", result=" + result + "]";
	}
	
}
