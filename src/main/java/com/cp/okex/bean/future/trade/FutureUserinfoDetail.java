package com.cp.okex.bean.future.trade;

public class FutureUserinfoDetail {

	/**
	 * 账户权益
	 */
	private Integer account_rights;
	/**
	 * 保证金
	 */
	private Double keep_deposit;
	/**
	 * 已实现盈亏
	 */
	private Double profit_real;
	/**
	 * 未实现盈亏
	 */
	private Double profit_unreal;
	/**
	 * 保证金率
	 */
	private Double risk_rate;
	
	
	public Integer getAccount_rights() {
		return account_rights;
	}
	public void setAccount_rights(Integer account_rights) {
		this.account_rights = account_rights;
	}
	public Double getKeep_deposit() {
		return keep_deposit;
	}
	public void setKeep_deposit(Double keep_deposit) {
		this.keep_deposit = keep_deposit;
	}
	public Double getProfit_real() {
		return profit_real;
	}
	public void setProfit_real(Double profit_real) {
		this.profit_real = profit_real;
	}
	public Double getProfit_unreal() {
		return profit_unreal;
	}
	public void setProfit_unreal(Double profit_unreal) {
		this.profit_unreal = profit_unreal;
	}
	public Double getRisk_rate() {
		return risk_rate;
	}
	public void setRisk_rate(Double risk_rate) {
		this.risk_rate = risk_rate;
	}
	
	
	@Override
	public String toString() {
		return "FutureUserinfoDetail [account_rights=" + account_rights + ", keep_deposit=" + keep_deposit
				+ ", profit_real=" + profit_real + ", profit_unreal=" + profit_unreal + ", risk_rate=" + risk_rate
				+ "]";
	}
	
	
}
