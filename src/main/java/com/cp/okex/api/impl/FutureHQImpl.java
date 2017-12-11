package com.cp.okex.api.impl;

import com.cp.okex.api.FutureHQ;
import com.cp.okex.bean.future.hq.ExchangeRate;
import com.cp.okex.bean.future.hq.FutureDepth;
import com.cp.okex.bean.future.hq.FutureEstimatedPrice;
import com.cp.okex.bean.future.hq.FutureHoldAmount;
import com.cp.okex.bean.future.hq.FutureIndex;
import com.cp.okex.bean.future.hq.FutureKline;
import com.cp.okex.bean.future.hq.FuturePriceLimit;
import com.cp.okex.bean.future.hq.FutureTicker;
import com.cp.okex.bean.future.hq.FutureTrades;
import com.cp.okex.enums.ContractType;
import com.cp.okex.enums.KlineType;
import com.cp.okex.enums.Merge;
import com.cp.okex.enums.Symbol;
import com.cp.okex.enums.Url;
import com.cp.okex.http.HttpClient;
import com.cp.okex.util.JSONUtils;

public class FutureHQImpl implements FutureHQ {

	@Override
	public FutureTicker futureTicker(Symbol symbol, ContractType contractType) throws Exception {
		String url = String.format("%s?symbol=%s&contract_type=%s", Url.获取OKEX合约行情.getUrl(), symbol.getValue(), contractType.getValue());
		String json = HttpClient.doGet(url);
		FutureTicker futureTicker = null;
		if(json!=null) {
			futureTicker = JSONUtils.toBean(json, FutureTicker.class);
		}
		return futureTicker;
	}

	@Override
	public FutureDepth futureDepth(Symbol symbol, ContractType contractType, Integer size, Merge merge) throws Exception {
		String url = String.format("%s?symbol=%s&contract_type=%s&size=%s&merge=%s", Url.获取OKEX合约深度信息.getUrl(), symbol.getValue(), contractType.getValue(), size, merge);
		String json = HttpClient.doGet(url);
		FutureDepth futureDepth = null;
		if(json!=null) {
			futureDepth = JSONUtils.toBean(json, FutureDepth.class);
		}
		return futureDepth;
	}

	@Override
	public FutureTrades futureTrades(Symbol symbol, ContractType contractType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FutureIndex futureIndex(Symbol symbol) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ExchangeRate exchangeRate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FutureEstimatedPrice futureEstimatedPrice(Symbol symbol) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FutureKline futureKline(Symbol symbol, ContractType contractType, KlineType klineType, Integer size,
			Long since) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FutureHoldAmount futureHoldAmount(Symbol symbol, ContractType contractType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FuturePriceLimit futurePriceLimit(Symbol symbol, ContractType contractType) {
		// TODO Auto-generated method stub
		return null;
	}

}
