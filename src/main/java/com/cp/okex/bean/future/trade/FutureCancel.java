package com.cp.okex.bean.future.trade;

public class FutureCancel {
	
	//多笔撤销返回的结果
	/**
	 * 订单id:错误id,订单id:错误id
	 */
	private String error;
	/**
	 * 订单id,订单id
	 */
	private String success;
	
	//单笔撤销返回的结果
	/**
	 * 订单ID
	 */
	private String order_id;
	/**
	 * 返回结果
	 */
	private Boolean result;
	
	
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String getSuccess() {
		return success;
	}
	public void setSuccess(String success) {
		this.success = success;
	}
	public String getOrder_id() {
		return order_id;
	}
	public void setOrder_id(String order_id) {
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
		return "FutureCancel [error=" + error + ", success=" + success + ", order_id=" + order_id + ", result=" + result
				+ "]";
	}
	
}
