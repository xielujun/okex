package com.cp.okex.bean.future.trade;

public class FutureUserinfo4fixContract {
	
	/**
	 * 比特币合约详情
	 */
	private FutureUserinfo4fixContracts btc;
	/**
	 * 莱特币合约详情
	 */
	private FutureUserinfo4fixContracts ltc;
	
	public FutureUserinfo4fixContracts getBtc() {
		return btc;
	}
	public void setBtc(FutureUserinfo4fixContracts btc) {
		this.btc = btc;
	}
	public FutureUserinfo4fixContracts getLtc() {
		return ltc;
	}
	public void setLtc(FutureUserinfo4fixContracts ltc) {
		this.ltc = ltc;
	}
	
	@Override
	public String toString() {
		return "FutureUserinfo4fixContract [btc=" + btc + ", ltc=" + ltc + "]";
	}
	
}
