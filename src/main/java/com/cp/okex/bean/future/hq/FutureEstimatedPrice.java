package com.cp.okex.bean.future.hq;

public class FutureEstimatedPrice {
	
	/**
	 * 交割预估价
	 */
	private Double forecast_price;

	public Double getForecast_price() {
		return forecast_price;
	}

	public void setForecast_price(Double forecast_price) {
		this.forecast_price = forecast_price;
	}

	@Override
	public String toString() {
		return "FutureEstimatedPrice [forecast_price=" + forecast_price + "]";
	}
	
}
