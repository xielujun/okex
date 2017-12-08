package com.cp.okex.bean.future.trade;

public class FuturePosition4fixDetail {
	
	/**
	 * 多仓数量
	 */
	private Long buy_amount;
	/**
	 * 多仓可平仓数量
	 */
	private Long buy_available;
	/**
	 * 多仓保证金
	 */
	private Double buy_bond;
	/**
	 * 多仓强平价格
	 */
	private Double buy_flatprice;
	/**
	 * 开仓平均价
	 */
	private Double buy_price_avg;
	/**
	 * 结算基准价
	 */
	private Double buy_price_cost;
	/**
	 * 多仓盈亏比
	 */
	private Double buy_profit_lossratio;
	/**
	 * 多仓已实现盈余
	 */
	private Double buy_profit_real;
	/**
	 * 合约id
	 */
	private Long contract_id;
	/**
	 * 合约类型
	 */
	private String contract_type;
	/**
	 * 创建日期
	 */
	private Long create_date;
	/**
	 * 空仓数量
	 */
	private Long sell_amount;
	/**
	 * 空仓可平仓数量
	 */
	private Long sell_available;
	/**
	 * 空仓保证金
	 */
	private Double sell_bond;
	/**
	 * 空仓强平价格
	 */
	private Double sell_flatprice;
	/**
	 * 开仓平均价
	 */
	private Double sell_price_avg;
	/**
	 * 结算基准价
	 */
	private Double sell_price_cost;
	/**
	 * 空仓盈亏比
	 */
	private Double sell_profit_lossratio;
	/**
	 * 空仓已实现盈余
	 */
	private Double sell_profit_real;
	/**
	 * 币种标识
	 */
	private String symbol;
	/**
	 * 杠杆倍数
	 */
	private Integer lever_rate;
	
	
	public Long getBuy_amount() {
		return buy_amount;
	}
	public void setBuy_amount(Long buy_amount) {
		this.buy_amount = buy_amount;
	}
	public Long getBuy_available() {
		return buy_available;
	}
	public void setBuy_available(Long buy_available) {
		this.buy_available = buy_available;
	}
	public Double getBuy_bond() {
		return buy_bond;
	}
	public void setBuy_bond(Double buy_bond) {
		this.buy_bond = buy_bond;
	}
	public Double getBuy_flatprice() {
		return buy_flatprice;
	}
	public void setBuy_flatprice(Double buy_flatprice) {
		this.buy_flatprice = buy_flatprice;
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
	public Double getBuy_profit_lossratio() {
		return buy_profit_lossratio;
	}
	public void setBuy_profit_lossratio(Double buy_profit_lossratio) {
		this.buy_profit_lossratio = buy_profit_lossratio;
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
	public String getContract_type() {
		return contract_type;
	}
	public void setContract_type(String contract_type) {
		this.contract_type = contract_type;
	}
	public Long getCreate_date() {
		return create_date;
	}
	public void setCreate_date(Long create_date) {
		this.create_date = create_date;
	}
	public Long getSell_amount() {
		return sell_amount;
	}
	public void setSell_amount(Long sell_amount) {
		this.sell_amount = sell_amount;
	}
	public Long getSell_available() {
		return sell_available;
	}
	public void setSell_available(Long sell_available) {
		this.sell_available = sell_available;
	}
	public Double getSell_bond() {
		return sell_bond;
	}
	public void setSell_bond(Double sell_bond) {
		this.sell_bond = sell_bond;
	}
	public Double getSell_flatprice() {
		return sell_flatprice;
	}
	public void setSell_flatprice(Double sell_flatprice) {
		this.sell_flatprice = sell_flatprice;
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
	public Double getSell_profit_lossratio() {
		return sell_profit_lossratio;
	}
	public void setSell_profit_lossratio(Double sell_profit_lossratio) {
		this.sell_profit_lossratio = sell_profit_lossratio;
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
	public Integer getLever_rate() {
		return lever_rate;
	}
	public void setLever_rate(Integer lever_rate) {
		this.lever_rate = lever_rate;
	}
	
	
	@Override
	public String toString() {
		return "FuturePosition4fixDetail [buy_amount=" + buy_amount + ", buy_available=" + buy_available + ", buy_bond="
				+ buy_bond + ", buy_flatprice=" + buy_flatprice + ", buy_price_avg=" + buy_price_avg
				+ ", buy_price_cost=" + buy_price_cost + ", buy_profit_lossratio=" + buy_profit_lossratio
				+ ", buy_profit_real=" + buy_profit_real + ", contract_id=" + contract_id + ", contract_type="
				+ contract_type + ", create_date=" + create_date + ", sell_amount=" + sell_amount + ", sell_available="
				+ sell_available + ", sell_bond=" + sell_bond + ", sell_flatprice=" + sell_flatprice
				+ ", sell_price_avg=" + sell_price_avg + ", sell_price_cost=" + sell_price_cost
				+ ", sell_profit_lossratio=" + sell_profit_lossratio + ", sell_profit_real=" + sell_profit_real
				+ ", symbol=" + symbol + ", lever_rate=" + lever_rate + "]";
	}
	
}
