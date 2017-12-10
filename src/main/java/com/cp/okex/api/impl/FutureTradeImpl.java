package com.cp.okex.api.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cp.okex.api.FutureTrade;
import com.cp.okex.bean.future.trade.FutureBatchTrade;
import com.cp.okex.bean.future.trade.FutureCancel;
import com.cp.okex.bean.future.trade.FutureDevolve;
import com.cp.okex.bean.future.trade.FutureExplosive;
import com.cp.okex.bean.future.trade.FutureOrderInfo;
import com.cp.okex.bean.future.trade.FutureOrdersInfo;
import com.cp.okex.bean.future.trade.FuturePosition;
import com.cp.okex.bean.future.trade.FuturePosition4fix;
import com.cp.okex.bean.future.trade.FutureTradeDetail;
import com.cp.okex.bean.future.trade.FutureTradesHistory;
import com.cp.okex.bean.future.trade.FutureUserinfo;
import com.cp.okex.bean.future.trade.FutureUserinfo4fix;
import com.cp.okex.bean.future.trade.OrdersData;
import com.cp.okex.enums.ContractType;
import com.cp.okex.enums.DevolveType;
import com.cp.okex.enums.ExplosiveStatus;
import com.cp.okex.enums.FutureErrorInfo;
import com.cp.okex.enums.LeverRate;
import com.cp.okex.enums.MatchPrice;
import com.cp.okex.enums.Symbol;
import com.cp.okex.enums.TradeStatus;
import com.cp.okex.enums.TradeType;
import com.cp.okex.enums.Url;
import com.cp.okex.http.HttpClient;
import com.cp.okex.util.DateUtils;
import com.cp.okex.util.JSONUtils;
import com.cp.okex.util.MD5Utils;

public class FutureTradeImpl implements FutureTrade {

	@Override
	public FutureUserinfo futureUserinfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FuturePosition futurePosition(Symbol symbol, ContractType contractType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FutureTradeDetail futureTrade(Symbol symbol, ContractType contractType, Double price, Integer amount,
		TradeType tradeType, MatchPrice matchPrice, LeverRate leverRate) throws Exception {
		Map<String, String> parameter = new HashMap<String, String>();
		parameter.put("api_key", ApiKey.apiKey);
		parameter.put("symbol", symbol.getValue());
		parameter.put("contract_type", contractType.getValue());
		parameter.put("price", price+"");
		parameter.put("amount", amount+"");
		parameter.put("type", tradeType.getValue()+"");
		parameter.put("match_price", matchPrice.getValue()+"");
		parameter.put("lever_rate", leverRate.getValue()+"");
		parameter.put("sign", MD5Utils.buildMysignV1(parameter, ApiKey.secretKey));
		String json = HttpClient.doPost(Url.合约下单.getUrl(), parameter);
		FutureTradeDetail futureTradeDetail = null;
		if(json!=null) {
			futureTradeDetail = JSONUtils.toBean(json, FutureTradeDetail.class);
			if(!futureTradeDetail.getResult()) {
				throw new Exception(String.format("[%s]合约下单失败[%s][%s,%s]", DateUtils.getCurrentDate(), FutureErrorInfo.getErrorMsg(futureTradeDetail.getError_code()), symbol.getValue(), contractType.getValue()));
			}
		}else {
			throw new Exception(String.format("[%s]合约下单失败[%s][%s,%s]", DateUtils.getCurrentDate(), "返回结果为空。", symbol.getValue(), contractType.getValue()));
		}
		return futureTradeDetail;
	}

	@Override
	public FutureTradesHistory futureTradesHistory(Symbol symbol, String date, Long since) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FutureBatchTrade futureBatchTrade(Symbol symbol, ContractType contractType, LeverRate leverRate,
			List<OrdersData> ordersDatas) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FutureCancel futureCancel(Symbol symbol, ContractType contractType, Long order_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FutureOrderInfo futureOrderInfo(Symbol symbol, ContractType contractType, TradeStatus tradeStatus,
			Long order_id, Integer current_page, Integer page_length) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FutureOrdersInfo futureOrdersInfo(Symbol symbol, ContractType contractType, String orders) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FutureUserinfo4fix futureUserinfo4fix() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FuturePosition4fix futurePosition4fix(Symbol symbol, ContractType contractType, LeverRate leverRate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FutureExplosive futureExplosive(Symbol symbol, ContractType contractType, ExplosiveStatus explosiveStatus,
			Integer current_page, Integer page_number, Integer page_length) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FutureDevolve futureDevolve(Symbol symbol, DevolveType devolveType, Double amount) {
		// TODO Auto-generated method stub
		return null;
	}

}
