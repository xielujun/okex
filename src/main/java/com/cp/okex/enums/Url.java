package com.cp.okex.enums;


public enum Url {
	
	//合约行情
	获取OKEX合约行情("/api/v1/future_ticker"),
	获取OKEX合约深度信息("/api/v1/future_depth"),
	获取OKEX合约交易记录信息("/api/v1/future_trades"),
	获取OKEX合约指数信息("/api/v1/future_index"),
	获取美元人民币汇率("/api/v1/exchange_rate"),
	获取交割预估价("/api/v1/future_estimated_price"),
	获取虚拟合约的K线数据("/api/v1/future_kline"),
	获取当前可用合约总持仓量("/api/v1/future_hold_amount"),
	获取合约最高买价和最低卖价("/api/v1/future_price_limit"),
	
	//合约交易API
	获取OKEX合约账户信息_全仓("/api/v1/future_userinfo"),
	获取用户持仓获取OKEX合约账户信息_全仓("/api/v1/future_position"),
	合约下单("/api/v1/future_trade"),
	获取OKEX合约交易历史_非个人("/api/v1/future_trades_history"),
	合约批量下单("/api/v1/future_batch_trade"),
	取消合约订单("/api/v1/future_cancel"),
	获取合约订单信息("/api/v1/future_order_info"),
	批量获取合约订单信息("/api/v1/future_orders_info"),
	获取逐仓合约账户信息("/api/v1/future_userinfo_4fix"),
	逐仓用户持仓查询("/api/v1/future_position_4fix"),
	获取合约爆仓单("/api/v1/future_explosive"),
	个人账户资金划转("/api/v1/future_devolve"),
	
	//现货行情API
	获取OKEx现货行情("/api/v1/ticker"),
	获取OKEx现货市场深度("/api/v1/depth"),
	获取OKEx现货交易信息_600条("/api/v1/trades"),
	获取OKEx现货K线数据("/api/v1/kline"),
	
	//现货交易API
	获取用户信息("/api/v1/userinfo"),
	现货下单("/api/v1/trade"),
	现货批量下单("/api/v1/batch_trade"),
	撤销订单("/api/v1/cancel_order"),
	获取用户的订单信息("/api/v1/order_info"),
	批量获取用户订单("/api/v1/orders_info"),
	获取历史订单信息_只返回最近两天的信息("/api/v1/order_history"),
	提币BTC_LTC_ETH_ETC_BCH("/api/v1/withdraw"),
	取消提币BTC_LTC_ETH_ETC_BCH("/api/v1/cancel_withdraw"),
	查询提币BTC_LTC_ETH_ETC_BCH信息("/api/v1/withdraw_info"),
	获取用户提现_充值记录("/api/v1/account_records");
	
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
