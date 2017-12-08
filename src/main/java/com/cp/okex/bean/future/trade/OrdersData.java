package com.cp.okex.bean.future.trade;

public class OrdersData {

	/**
	 * 委托价格
	 */
	private Double price;
	/**
	 * 委托数量
	 */
	private Long amount;
	/**
	 * 交易类型
	 */
	private Integer type;
	/**
	 * 是否对手价
	 */
	private Integer match_price;
	
	
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Long getAmount() {
		return amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getMatch_price() {
		return match_price;
	}
	public void setMatch_price(Integer match_price) {
		this.match_price = match_price;
	}
	
	@Override
	public String toString() {
		return "OrdersData [price=" + price + ", amount=" + amount + ", type=" + type + ", match_price=" + match_price
				+ "]";
	}
	
}
