package com.cp.okex.enums;

public enum DevolveType {
	
	现货转合约(1),
	合约转现货(2);
	
	private Integer value;
	
	DevolveType(Integer value){
		this.value = value;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}
	
}
