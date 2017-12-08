package com.cp.okex.bean.future.trade;

import java.util.List;

public class FuturePosition {
	
	/**
	 * 预估爆仓价
	 */
	private Double force_liqu_price;
	/**
	 * 合约持仓详情
	 */
	private List<FuturePositionDetail> holding;
	/**
	 * 返回结果
	 */
	private Boolean result;
	
	public Double getForce_liqu_price() {
		return force_liqu_price;
	}
	public void setForce_liqu_price(Double force_liqu_price) {
		this.force_liqu_price = force_liqu_price;
	}
	public List<FuturePositionDetail> getHolding() {
		return holding;
	}
	public void setHolding(List<FuturePositionDetail> holding) {
		this.holding = holding;
	}
	public Boolean getResult() {
		return result;
	}
	public void setResult(Boolean result) {
		this.result = result;
	}
	
	@Override
	public String toString() {
		return "FuturePosition [force_liqu_price=" + force_liqu_price + ", holding=" + holding + ", result=" + result
				+ "]";
	}
	
}
