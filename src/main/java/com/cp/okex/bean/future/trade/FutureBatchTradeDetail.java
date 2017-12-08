package com.cp.okex.bean.future.trade;

public class FutureBatchTradeDetail {
	
	/**
	 * 错误码
	 */
	private String error_code;
	/**
	 * 订单ID
	 */
	private String order_id;
	
	public String getError_code() {
		return error_code;
	}
	public void setError_code(String error_code) {
		this.error_code = error_code;
	}
	public String getOrder_id() {
		return order_id;
	}
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
	
	@Override
	public String toString() {
		return "FutureBatchTradeDetail [error_code=" + error_code + ", order_id=" + order_id + "]";
	}
	
}
