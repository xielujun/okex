package com.cp.okex.bean.future.trade;

import java.util.List;

public class FutureTradesHistory {
	
	/**
	 * 历史交易明细
	 */
	private List<FutureTradesHistoryDetail> futureTradesHistoryDetail;

	public List<FutureTradesHistoryDetail> getFutureTradesHistoryDetail() {
		return futureTradesHistoryDetail;
	}

	public void setFutureTradesHistoryDetail(List<FutureTradesHistoryDetail> futureTradesHistoryDetail) {
		this.futureTradesHistoryDetail = futureTradesHistoryDetail;
	}

	@Override
	public String toString() {
		return "FutureTradesHistory [futureTradesHistoryDetail=" + futureTradesHistoryDetail + "]";
	}
	
}
