package com.cp.okex.enums;

public enum KlineType {
	
	分钟1("1min"),
	分钟3("3min"),
	分钟5("5min"),
	分钟15("15min"),
	分钟30("30min"),
	日1("1day"),
	日3("3day"),
	周1("1week"),
	小时1("1hour"),
	小时2("2hour"),
	小时4("4hour"),
	小时6("6hour"),
	小时12("12hour");
	
	private String value;
	
	KlineType(String value){
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
}
