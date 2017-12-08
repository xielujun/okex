package com.cp.okex.bean.future.trade;

import java.util.List;

public class FutureExplosive {
	
	/**
	 * 爆仓订单详情
	 */
	private List<FutureExplosiveDetail> data;

	public List<FutureExplosiveDetail> getData() {
		return data;
	}

	public void setData(List<FutureExplosiveDetail> data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "FutureExplosive [data=" + data + "]";
	}
	
}
