package com.cp.okex.bean.future.trade;

import java.util.List;

public class FuturePosition4fix {
	
	/**
	 * 用户持仓详情
	 */
	private List<FuturePosition4fix> holding;
	/**
	 * 返回结果
	 */
	private Boolean result;
	
	public List<FuturePosition4fix> getHolding() {
		return holding;
	}
	public void setHolding(List<FuturePosition4fix> holding) {
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
		return "FuturePosition4fix [holding=" + holding + ", result=" + result + "]";
	}

}
