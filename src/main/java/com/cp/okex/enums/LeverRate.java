package com.cp.okex.enums;

public enum LeverRate {
	
	倍10(10),
	倍20(20);
	
	private Integer value;
	
	LeverRate(Integer value){
		this.value = value;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}
	
}
