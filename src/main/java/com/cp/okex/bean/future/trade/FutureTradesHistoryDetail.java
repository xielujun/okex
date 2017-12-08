package com.cp.okex.bean.future.trade;

public class FutureTradesHistoryDetail {
	
	private Long amount;
	private Long date;
	private Double price;
	private Long tid;
	private String type;
	
	
	public Long getAmount() {
		return amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
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
	public Long getTid() {
		return tid;
	}
	public void setTid(Long tid) {
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
		return "FutureTradesHistory [amount=" + amount + ", date=" + date + ", price=" + price + ", tid=" + tid
				+ ", type=" + type + "]";
	}
	
}
