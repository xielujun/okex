package com.cp.okex.bean.future.trade;

public class FutureUserinfo {
	
	/**
	 * 比特币账户信息
	 */
	private FutureUserinfoDetail btc;
	/**
	 * 莱特币账户信息
	 */
	private FutureUserinfoDetail ltc;
	/**
	 * 返回结果
	 */
	private Boolean result;
	
	
	public FutureUserinfoDetail getBtc() {
		return btc;
	}
	public void setBtc(FutureUserinfoDetail btc) {
		this.btc = btc;
	}
	public FutureUserinfoDetail getLtc() {
		return ltc;
	}
	public void setLtc(FutureUserinfoDetail ltc) {
		this.ltc = ltc;
	}
	public Boolean getResult() {
		return result;
	}
	public void setResult(Boolean result) {
		this.result = result;
	}
	
	@Override
	public String toString() {
		return "FutureUserinfo [btc=" + btc + ", ltc=" + ltc + ", result=" + result + "]";
	}

}
