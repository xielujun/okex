package com.cp.okex.bean.future.trade;

import java.util.List;

public class FutureBatchTrade {
	
	/**
	 * 返回结果详情
	 */
	private List<FutureBatchTradeDetail> order_info;
	/**
	 * 返回结果
	 */
	private Boolean result;
	
	
	public List<FutureBatchTradeDetail> getOrder_info() {
		return order_info;
	}
	public void setOrder_info(List<FutureBatchTradeDetail> order_info) {
		this.order_info = order_info;
	}
	public Boolean getResult() {
		return result;
	}
	public void setResult(Boolean result) {
		this.result = result;
	}
	
	
	@Override
	public String toString() {
		return "FutureBatchTrade [order_info=" + order_info + ", result=" + result + "]";
	}
	
}
