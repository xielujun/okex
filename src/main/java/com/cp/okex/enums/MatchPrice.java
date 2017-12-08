package com.cp.okex.enums;

public enum MatchPrice {
	
	非对手价(0),
	对手价(1);
	
	private Integer value;
	
	MatchPrice(Integer value){
		this.value = value;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}
	
}
