package com.cp.okex.bean.future.trade;

import java.util.List;

public class FutureUserinfo4fixContracts {
	
	/**
	 * 账户余额
	 */
	private Double balance;
	/**
	 * 合约详情
	 */
	private List<FutureUserinfo4fixContractsDetail> contracts;
	/**
	 * 账户权益
	 */
	private Double rights;
	
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public List<FutureUserinfo4fixContractsDetail> getContracts() {
		return contracts;
	}
	public void setContracts(List<FutureUserinfo4fixContractsDetail> contracts) {
		this.contracts = contracts;
	}
	public Double getRights() {
		return rights;
	}
	public void setRights(Double rights) {
		this.rights = rights;
	}
	
	@Override
	public String toString() {
		return "FutureUserinfo4fixContracts [balance=" + balance + ", contracts=" + contracts + ", rights=" + rights
				+ "]";
	}
	
}
