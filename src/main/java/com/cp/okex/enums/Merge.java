package com.cp.okex.enums;

/**
 * 是否合并深度
 * @author Administrator
 *
 */
public enum Merge {
	
	合并(0),
	不合并(2);
	
	private Integer value;
	
	Merge(Integer value){
		this.value = value;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}
	

}
