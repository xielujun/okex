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
	
	/**
	 * 错误码
	 */
	private Integer error_code;
	
	
	
	public Integer getError_code() {
		return error_code;
	}
	public void setError_code(Integer error_code) {
		this.error_code = error_code;
	}
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
		return "FutureOrderInfo [orders=" + orders + ", result=" + result + ", error_code=" + error_code + "]";
	}
	
}
