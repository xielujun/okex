package com.cp.okex.enums;

public enum FutureErrorInfo {
	
	用户不存在(20001,"用户不存在"),
	用户被冻结(20002,"用户被冻结"),
	用户被爆仓冻结(20003,"用户被爆仓冻结"),
	合约账户被冻结(20004,"合约账户被冻结"),
	用户合约账户不存在(20005,"用户合约账户不存在"),
	必填参数为空(20006,"必填参数为空"),
	参数错误(20007,"参数错误"),
	合约账户余额为空(20008,"合约账户余额为空"),
	虚拟合约状态错误(20009,"虚拟合约状态错误"),
	合约风险率信息不存在(20010,"合约风险率信息不存在"),
	倍10或20倍杠杆开BTC前保证金率低于百分之90或百分之8010倍或20倍杠杆开LTC前保证金率低于百分之80或百分之602011(20011,"10倍/20倍杠杆开BTC前保证金率低于90%/80%，10倍/20倍杠杆开LTC前保证金率低于80%/60%"),
	倍10或20倍杠杆开BTC前保证金率低于百分之90或百分之8010倍或20倍杠杆开LTC前保证金率低于百分之80或百分之602012(20012,"10倍/20倍杠杆开BTC后保证金率低于90%/80%，10倍/20倍杠杆开LTC后保证金率低于80%/60%"),
	暂无对手价(20013,"暂无对手价"),
	系统错误(20014,"系统错误"),
	订单信息不存在(20015,"订单信息不存在"),
	平仓数量是否大于同方向可用持仓数量(20016,"平仓数量是否大于同方向可用持仓数量"),
	非本人操作(20017,"非本人操作"),
	下单价格高于前一分钟的百分之103或低于百分之97(20018,"下单价格高于前一分钟的103%或低于97%"),
	该IP限制不能请求该资源(20019,"该IP限制不能请求该资源"),
	密钥不存在(20020,"密钥不存在"),
	指数信息不存在(20021,"指数信息不存在"),
	接口调用错误_全仓模式调用全仓接口_逐仓模式调用逐仓接口(20022,"接口调用错误（全仓模式调用全仓接口，逐仓模式调用逐仓接口）"),
	逐仓用户(20023,"逐仓用户"),
	sign签名不匹配(20024,"sign签名不匹配"),
	杠杆比率错误(20025,"杠杆比率错误"),
	API鉴权错误(20026,"API鉴权错误"),
	无交易记录(20027,"无交易记录"),
	合约不存在(20028,"合约不存在"),
	转出金额大于可转金额(20029,"转出金额大于可转金额"),
	账户存在借款(20030,"账户存在借款"),
	根据相关法律_您所在的国家或地区不能使用该功能(20038,"根据相关法律，您所在的国家或地区不能使用该功能。"),
	用户请求接口过于频繁(20049,"用户请求接口过于频繁");
	
	private Integer errorCode;
	private String errorMsg;
	
	
	FutureErrorInfo(Integer errorCode, String errorMsg){
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
	}


	public Integer getErrorCode() {
		return errorCode;
	}


	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}


	public String getErrorMsg() {
		return errorMsg;
	}


	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	
	
	public static String getErrorMsg(Integer errorCode) {
		for(FutureErrorInfo f : FutureErrorInfo.values()) {
			if(f.getErrorCode().equals(errorCode)) {
				return f.getErrorMsg();
			}
		}
		return "未知错误";
	}
	
}
