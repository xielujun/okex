package com.cp.okex.enums;

public enum TradeStatus {
	
	未完成的订单(1),
	已经完成的订单(2);
	
	private Integer value;
	
	TradeStatus(Integer value){
		this.value = value;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}
	

}
