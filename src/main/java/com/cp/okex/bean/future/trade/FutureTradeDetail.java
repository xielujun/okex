package com.cp.okex.bean.future.trade;

public class FutureTradeDetail {
	
	/**
	 * 订单ID
	 */
	private Long order_id;
	/**
	 * 返回结果
	 */
	private Boolean result;
	/**
	 * 错误码
	 */
	private Integer error_code;
	
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
	public Integer getError_code() {
		return error_code;
	}
	public void setError_code(Integer error_code) {
		this.error_code = error_code;
	}
	
	@Override
	public String toString() {
		return "FutureTradeDetail [order_id=" + order_id + ", result=" + result + ", error_code=" + error_code + "]";
	}
	
}
