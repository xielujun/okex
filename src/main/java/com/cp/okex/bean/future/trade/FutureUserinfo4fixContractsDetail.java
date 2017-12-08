package com.cp.okex.bean.future.trade;

public class FutureUserinfo4fixContractsDetail {
	
	/**
	 * 合约可用
	 */
	private Double available;
	/**
	 * 账户余额
	 */
	private Double balance;
	/**
	 * 固定保证金
	 */
	private Double bond;
	/**
	 * 合约ID
	 */
	private Long contract_id;
	/**
	 * 合约类别
	 */
	private String contract_type;
	/**
	 * 冻结
	 */
	private Double freeze;
	/**
	 * 已实现盈亏
	 */
	private Double profit;
	/**
	 * 未实现盈亏
	 */
	private Double unprofit;
	
	public Double getAvailable() {
		return available;
	}
	public void setAvailable(Double available) {
		this.available = available;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public Double getBond() {
		return bond;
	}
	public void setBond(Double bond) {
		this.bond = bond;
	}
	public Long getContract_id() {
		return contract_id;
	}
	public void setContract_id(Long contract_id) {
		this.contract_id = contract_id;
	}
	public String getContract_type() {
		return contract_type;
	}
	public void setContract_type(String contract_type) {
		this.contract_type = contract_type;
	}
	public Double getFreeze() {
		return freeze;
	}
	public void setFreeze(Double freeze) {
		this.freeze = freeze;
	}
	public Double getProfit() {
		return profit;
	}
	public void setProfit(Double profit) {
		this.profit = profit;
	}
	public Double getUnprofit() {
		return unprofit;
	}
	public void setUnprofit(Double unprofit) {
		this.unprofit = unprofit;
	}
	
	@Override
	public String toString() {
		return "FutureUserinfo4fixContractsDetail [available=" + available + ", balance=" + balance + ", bond=" + bond
				+ ", contract_id=" + contract_id + ", contract_type=" + contract_type + ", freeze=" + freeze
				+ ", profit=" + profit + ", unprofit=" + unprofit + "]";
	}
	
}
