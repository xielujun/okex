package com.cp.okex.enums;

/**
 * 合约类型
 * @author Administrator
 *
 */
public enum ContractType {
	
	当周("this_week"),
	下周("next_week"),
	季度("quarter");
	
	private String value;
	
	ContractType(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	

}
