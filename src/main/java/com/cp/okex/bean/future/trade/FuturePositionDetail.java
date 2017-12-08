package com.cp.okex.bean.future.trade;

public class FuturePositionDetail {

	/**
	 * 多仓数量
	 */
	private Double buy_amount;
	/**
	 * 多仓可平仓数量
	 */
	private Double buy_available;
	/**
	 * 开仓平均价
	 */
	private Double buy_price_avg;
	/**
	 * 结算基准价
	 */
	private Double buy_price_cost;
	/**
	 * 多仓已实现盈余
	 */
	private Double buy_profit_real;
	/**
	 * 合约id
	 */
	private Long contract_id;
	/**
	 * 创建日期
	 */
	private Long create_date;
	/**
	 * 杠杆倍数
	 */
	private Integer lever_rate;
	/**
	 * 空仓数量
	 */
	private Double sell_amount;
	/**
	 * 空仓可平仓数量
	 */
	private Double sell_available;
	/**
	 * 开仓平均价
	 */
	private Double sell_price_avg;
	/**
	 * 结算基准价
	 */
	private Double sell_price_cost;
	/**
	 * 空仓已实现盈余
	 */
	private Double sell_profit_real;
	/**
	 * 币种标识
	 */
	private String symbol;
	/**
	 * 合约类型
	 */
	private String contract_type;
	
	
	public Double getBuy_amount() {
		return buy_amount;
	}
	public void setBuy_amount(Double buy_amount) {
		this.buy_amount = buy_amount;
	}
	public Double getBuy_available() {
		return buy_available;
	}
	public void setBuy_available(Double buy_available) {
		this.buy_available = buy_available;
	}
	public Double getBuy_price_avg() {
		return buy_price_avg;
	}
	public void setBuy_price_avg(Double buy_price_avg) {
		this.buy_price_avg = buy_price_avg;
	}
	public Double getBuy_price_cost() {
		return buy_price_cost;
	}
	public void setBuy_price_cost(Double buy_price_cost) {
		this.buy_price_cost = buy_price_cost;
	}
	public Double getBuy_profit_real() {
		return buy_profit_real;
	}
	public void setBuy_profit_real(Double buy_profit_real) {
		this.buy_profit_real = buy_profit_real;
	}
	public Long getContract_id() {
		return contract_id;
	}
	public void setContract_id(Long contract_id) {
		this.contract_id = contract_id;
	}
	public Long getCreate_date() {
		return create_date;
	}
	public void setCreate_date(Long create_date) {
		this.create_date = create_date;
	}
	public Integer getLever_rate() {
		return lever_rate;
	}
	public void setLever_rate(Integer lever_rate) {
		this.lever_rate = lever_rate;
	}
	public Double getSell_amount() {
		return sell_amount;
	}
	public void setSell_amount(Double sell_amount) {
		this.sell_amount = sell_amount;
	}
	public Double getSell_available() {
		return sell_available;
	}
	public void setSell_available(Double sell_available) {
		this.sell_available = sell_available;
	}
	public Double getSell_price_avg() {
		return sell_price_avg;
	}
	public void setSell_price_avg(Double sell_price_avg) {
		this.sell_price_avg = sell_price_avg;
	}
	public Double getSell_price_cost() {
		return sell_price_cost;
	}
	public void setSell_price_cost(Double sell_price_cost) {
		this.sell_price_cost = sell_price_cost;
	}
	public Double getSell_profit_real() {
		return sell_profit_real;
	}
	public void setSell_profit_real(Double sell_profit_real) {
		this.sell_profit_real = sell_profit_real;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getContract_type() {
		return contract_type;
	}
	public void setContract_type(String contract_type) {
		this.contract_type = contract_type;
	}
	
	@Override
	public String toString() {
		return "FuturePositionDetail [buy_amount=" + buy_amount + ", buy_available=" + buy_available
				+ ", buy_price_avg=" + buy_price_avg + ", buy_price_cost=" + buy_price_cost + ", buy_profit_real="
				+ buy_profit_real + ", contract_id=" + contract_id + ", create_date=" + create_date + ", lever_rate="
				+ lever_rate + ", sell_amount=" + sell_amount + ", sell_available=" + sell_available
				+ ", sell_price_avg=" + sell_price_avg + ", sell_price_cost=" + sell_price_cost + ", sell_profit_real="
				+ sell_profit_real + ", symbol=" + symbol + ", contract_type=" + contract_type + "]";
	}
	
}
