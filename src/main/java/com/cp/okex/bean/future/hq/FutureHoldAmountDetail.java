package com.cp.okex.bean.future.hq;

public class FutureHoldAmountDetail {
	
	/**
	 * 总持仓量（张）
	 */
	private Long amount;
	/**
	 * 合约名
	 */
	private String contract_name;
	
	
	public Long getAmount() {
		return amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}
	public String getContract_name() {
		return contract_name;
	}
	public void setContract_name(String contract_name) {
		this.contract_name = contract_name;
	}
	
	
	@Override
	public String toString() {
		return "FutureHoldAmountDetail [amount=" + amount + ", contract_name=" + contract_name + "]";
	}
	
}
