package com.cp.okex.bean.future.hq;

import java.util.List;

public class FutureHoldAmount {
	
	/**
	 * 持仓量
	 * Long 总持仓量（张）
	 * String 合约名
	 */
	private List<FutureHoldAmountDetail> holdAmount;

	public List<FutureHoldAmountDetail> getHoldAmount() {
		return holdAmount;
	}

	public void setHoldAmount(List<FutureHoldAmountDetail> holdAmount) {
		this.holdAmount = holdAmount;
	}

	@Override
	public String toString() {
		return "FutureHoldAmount [holdAmount=" + holdAmount + "]";
	}
	
}
