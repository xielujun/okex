package com.cp.okex.enums;

public enum TradeType {
	
	开多(1),
	开空(2),
	平多(3),
	平空(4);
	
	private Integer value;
	
	TradeType(Integer value){
		this.value = value;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}
	
}
