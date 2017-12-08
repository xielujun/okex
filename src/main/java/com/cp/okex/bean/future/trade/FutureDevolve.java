package com.cp.okex.bean.future.trade;

public class FutureDevolve {

	/**
	 * 返回结果
	 */
	private Boolean reslt;
	/**
	 * 错误码
	 */
	private Integer error_code;
	
	public Boolean getReslt() {
		return reslt;
	}
	public void setReslt(Boolean reslt) {
		this.reslt = reslt;
	}
	public Integer getError_code() {
		return error_code;
	}
	public void setError_code(Integer error_code) {
		this.error_code = error_code;
	}
	
	@Override
	public String toString() {
		return "FutureDevolve [reslt=" + reslt + ", error_code=" + error_code + "]";
	}
	
}
