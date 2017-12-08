package com.cp.okex.bean.future.trade;

public class FutureUserinfo4fix {
	
	/**
	 * 合约账户详情
	 */
	private FutureUserinfo4fixContract info;
	/**
	 * 返回结果
	 */
	private Boolean result;
	
	public FutureUserinfo4fixContract getInfo() {
		return info;
	}
	public void setInfo(FutureUserinfo4fixContract info) {
		this.info = info;
	}
	public Boolean getResult() {
		return result;
	}
	public void setResult(Boolean result) {
		this.result = result;
	}
	
	@Override
	public String toString() {
		return "FutureUserinfo4fix [info=" + info + ", result=" + result + "]";
	}
	
}
