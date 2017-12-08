package com.cp.okex.bean.future.trade;

public class FutureExplosiveDetail {
	
	/**
	 * 委托数量（张）
	 */
	private String amount;
	/**
	 * 创建时间
	 */
	private String create_date;
	/**
	 * 穿仓用户亏损
	 */
	private String loss;
	/**
	 * 委托价格
	 */
	private String price;
	/**
	 * 交易类型
	 */
	private Integer type;
	
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getCreate_date() {
		return create_date;
	}
	public void setCreate_date(String create_date) {
		this.create_date = create_date;
	}
	public String getLoss() {
		return loss;
	}
	public void setLoss(String loss) {
		this.loss = loss;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "FutureExplosiveDetail [amount=" + amount + ", create_date=" + create_date + ", loss=" + loss
				+ ", price=" + price + ", type=" + type + "]";
	}
	
}
