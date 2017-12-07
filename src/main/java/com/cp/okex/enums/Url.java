package com.cp.okex.enums;


public enum Url {
	
	获取OKEX合约行情("/api/v1/future_ticker"),
	获取OKEX合约深度信息("/api/v1/future_depth"),
	获取OKEX合约交易记录信息("/api/v1/future_trades"),
	获取OKEX合约指数信息("/api/v1/future_index"),
	获取美元人民币汇率("/api/v1/exchange_rate"),
	获取交割预估价("/api/v1/future_estimated_price"),
	获取OKEX合约行情("/api/v1/future_ticker.do"),
	获取OKEX合约行情("/api/v1/future_ticker.do"),
	获取OKEX合约行情("/api/v1/future_ticker.do"),
	获取OKEX合约行情("/api/v1/future_ticker.do");
	
	private static final String BASE = "https://www.okex.com";
	private static final String AFTER = ".do";
	
	private String url;

	Url(String url){
		this.url=url;
	}

	public String getUrl() {
		return BASE+url+AFTER;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	
}
