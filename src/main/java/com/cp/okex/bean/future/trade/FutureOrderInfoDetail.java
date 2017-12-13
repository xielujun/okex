package com.cp.okex.bean.future.trade;

public class FutureOrderInfoDetail {
	
	/**
	 * 委托数量
	 */
	private Integer amount;
	/**
	 * 合约名称
	 */
	private String contract_name;
	/**
	 * 委托时间
	 */
	private Long create_date;
	/**
	 * 成交数量
	 */
	private Integer deal_amount;
	/**
	 * 手续费
	 */
	private Double fee;
	/**
	 * 订单ID
	 */
	private Long order_id;
	/**
	 * 订单价格
	 */
	private Double price;
	/**
	 * 平均价格
	 */
	private Double price_avg;
	/**
	 * 订单状态  (0等待成交 1部分成交 2全部成交 -1撤单 4撤单处理中)
	 */
	private Integer status;
	/**
	 * 币种标识 
	 */
	private String symbol;
	/**
	 * 订单类型 
	 */
	private Integer type;
	/**
	 * 合约面值
	 */
	private Double unit_amount;
	/**
	 * 杠杆倍数 
	 */
	private Integer lever_rate;
	
	
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public String getContract_name() {
		return contract_name;
	}
	public void setContract_name(String contract_name) {
		this.contract_name = contract_name;
	}
	public Long getCreate_date() {
		return create_date;
	}
	public void setCreate_date(Long create_date) {
		this.create_date = create_date;
	}
	public Integer getDeal_amount() {
		return deal_amount;
	}
	public void setDeal_amount(Integer deal_amount) {
		this.deal_amount = deal_amount;
	}
	public Double getFee() {
		return fee;
	}
	public void setFee(Double fee) {
		this.fee = fee;
	}
	public Long getOrder_id() {
		return order_id;
	}
	public void setOrder_id(Long order_id) {
		this.order_id = order_id;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Double getPrice_avg() {
		return price_avg;
	}
	public void setPrice_avg(Double price_avg) {
		this.price_avg = price_avg;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Double getUnit_amount() {
		return unit_amount;
	}
	public void setUnit_amount(Double unit_amount) {
		this.unit_amount = unit_amount;
	}
	public Integer getLever_rate() {
		return lever_rate;
	}
	public void setLever_rate(Integer lever_rate) {
		this.lever_rate = lever_rate;
	}
	
	
	@Override
	public String toString() {
		return "FutureOrderInfoDetail [amount=" + amount + ", contract_name=" + contract_name + ", create_date="
				+ create_date + ", deal_amount=" + deal_amount + ", fee=" + fee + ", order_id=" + order_id + ", price="
				+ price + ", price_avg=" + price_avg + ", status=" + status + ", symbol=" + symbol + ", type=" + type
				+ ", unit_amount=" + unit_amount + ", lever_rate=" + lever_rate + "]";
	}
	
}
