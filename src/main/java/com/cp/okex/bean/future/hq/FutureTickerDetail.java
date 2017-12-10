package com.cp.okex.bean.future.hq;

public class FutureTickerDetail {

	/**
	 * 买一价
	 */
	private Double buy;
	/**
	 * 合约ID
	 */
	private Long contract_id;
	/**
	 * 最高价
	 */
	private Double high;
	/**
	 * 最新成交价
	 */
	private Double last;
	/**
	 * 最低价
	 */
	private Double low;
	/**
	 * 卖一价
	 */
	private Double sell;
	/**
	 * 合约面值
	 */
	private Double unit_amount;
	/**
	 * 成交量(最近的24小时)
	 */
	private Long vol;
	
	
	public Double getBuy() {
		return buy;
	}
	public void setBuy(Double buy) {
		this.buy = buy;
	}
	public Long getContract_id() {
		return contract_id;
	}
	public void setContract_id(Long contract_id) {
		this.contract_id = contract_id;
	}
	public Double getHigh() {
		return high;
	}
	public void setHigh(Double high) {
		this.high = high;
	}
	public Double getLast() {
		return last;
	}
	public void setLast(Double last) {
		this.last = last;
	}
	public Double getLow() {
		return low;
	}
	public void setLow(Double low) {
		this.low = low;
	}
	public Double getSell() {
		return sell;
	}
	public void setSell(Double sell) {
		this.sell = sell;
	}
	public Double getUnit_amount() {
		return unit_amount;
	}
	public void setUnit_amount(Double unit_amount) {
		this.unit_amount = unit_amount;
	}
	public Long getVol() {
		return vol;
	}
	public void setVol(Long vol) {
		this.vol = vol;
	}
	
	
	@Override
	public String toString() {
		return "FutureHQ [buy=" + buy + ", contract_id=" + contract_id + ", high=" + high + ", last=" + last + ", low="
				+ low + ", sell=" + sell + ", unit_amount=" + unit_amount + ", vol=" + vol + "]";
	}
	
	
}
