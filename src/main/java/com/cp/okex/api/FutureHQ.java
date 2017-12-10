package com.cp.okex.api;

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

/**
 * OKEX合约行情API
 * @author Administrator
 *
 */
public interface FutureHQ {
	
	/**
	 * 获取合约行情
	 * @param symbol	币种标识
	 * @param contractType	合约类型
	 * @return
	 */
	FutureTicker futureTicker(Symbol symbol, ContractType contractType) throws Exception;
	
	/**
	 * 获取合约行情深度
	 * @param symbol	币种标识
	 * @param contractType	合约类型
	 * @param size	默认5条
	 * @param merge	是否合并深度
	 * @return
	 */
	FutureDepth futureDepth(Symbol symbol, ContractType contractType, Integer size, Merge merge) throws Exception;
	
	/**
	 * 获取合约交易记录信息
	 * @param symbol	币种标识
	 * @param contractType	合约类型
	 * @return
	 */
	FutureTrades futureTrades(Symbol symbol, ContractType contractType) throws Exception;
	
	/**
	 * 获取合约指数信息
	 * @param symbol
	 * @return
	 */
	FutureIndex futureIndex(Symbol symbol) throws Exception;
	
	/**
	 * 获取美元-人民币汇率
	 * @return
	 */
	ExchangeRate exchangeRate() throws Exception;
	
	/**
	 * 获取交割预估价
	 * 注意：交割预估价只有交割前三小时返回
	 * @param symbol
	 * @return
	 */
	FutureEstimatedPrice futureEstimatedPrice(Symbol symbol) throws Exception;
	
	/**
	 * 获取合约K线数据
	 * @param symbol		币种标识
	 * @param contractType	合约类型
	 * @param klineType		K线类型
	 * @param size	获取数据的条数 默认0条
	 * @param since	时间戳（eg：1417536000000）。 返回该时间戳以后的数据
	 * @return
	 */
	FutureKline futureKline(Symbol symbol, ContractType contractType, KlineType klineType, Integer size, Long since) throws Exception;
	
	/**
	 * 获取当前可用合约总持仓量
	 * @param symbol	币种标识
	 * @param contractType	合约类型
	 * @return
	 */
	FutureHoldAmount futureHoldAmount(Symbol symbol, ContractType contractType) throws Exception;
	
	/**
	 * 获取合约最高买价和最低卖价
	 * @param symbol	币种标识
	 * @param contractType	合约类型
	 * @return
	 */
	FuturePriceLimit futurePriceLimit(Symbol symbol, ContractType contractType) throws Exception;

}
