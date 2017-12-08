package com.cp.okex.enums;

public enum ExplosiveStatus {
	
	最近7天未成交(0),
	最近7天已成交(1);
	
	private Integer value;
	
	ExplosiveStatus(Integer value){
		this.value = value;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}
	
}
