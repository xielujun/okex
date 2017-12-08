package com.cp.okex.bean.future.hq;

public class FutureTrades {
	
	/**
	 * 交易数量
	 */
	private Integer amount;
	/**
	 * 交易时间(毫秒)
	 */
	private Long date_ms;
	/**
	 * 交易时间
	 */
	private Long date;
	/**
	 * 交易价格
	 */
	private Double price;
	/**
	 * 交易ID
	 */
	private Integer tid;
	/**
	 * 交易类型
	 */
	private String type;
	
	
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public Long getDate_ms() {
		return date_ms;
	}
	public void setDate_ms(Long date_ms) {
		this.date_ms = date_ms;
	}
	public Long getDate() {
		return date;
	}
	public void setDate(Long date) {
		this.date = date;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	@Override
	public String toString() {
		return "futureTrades [amount=" + amount + ", date_ms=" + date_ms + ", date=" + date + ", price=" + price
				+ ", tid=" + tid + ", type=" + type + "]";
	}
	

}
