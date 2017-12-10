package com.cp.okex.api;

import java.util.List;

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
import com.cp.okex.enums.LeverRate;
import com.cp.okex.enums.MatchPrice;
import com.cp.okex.enums.Symbol;
import com.cp.okex.enums.TradeStatus;
import com.cp.okex.enums.TradeType;

/**
 * 合约交易API
 * @author Administrator
 *
 */
public interface FutureTrade {
	
	/**
	 * 获取合约账户信息 （全仓）
	 * @return
	 */
	FutureUserinfo futureUserinfo()throws Exception ;
	
	/**
	 * 获取用户持仓获取OKEX合约账户信息 （全仓）
	 * @param symbol	币种标识
	 * @param contractType	合约类型
	 * @return
	 */
	FuturePosition futurePosition(Symbol symbol, ContractType contractType)throws Exception ;
	
	/**
	 * 合约下单
	 * @param symbol	币种标识
	 * @param contractType	合约类型
	 * @param price		委托价格
	 * @param amount	委托数量
	 * @param tradeType	交易类型
	 * @param matchPrice	是否对手价	对手价是委托价格无效
	 * @param leverRate		杠杆倍数
	 * @return
	 */
	FutureTradeDetail futureTrade(Symbol symbol, ContractType contractType, Double price, Integer amount, TradeType tradeType, MatchPrice matchPrice, LeverRate leverRate)throws Exception ;
	
	/**
	 * 获取交易历史
	 * @param symbol	币种标识
	 * @param date		合约交割时间，格式yyyy-MM-dd
	 * @param since		交易Id起始位置
	 * @return
	 */
	FutureTradesHistory futureTradesHistory(Symbol symbol, String date, Long since)throws Exception ;
	
	/**
	 * 批量下单
	 * @param symbol	币种标识
	 * @param contractType	合约类型
	 * @param leverRate		杠杆倍数
	 * @param orders_data	下单详情
	 * @return
	 */
	FutureBatchTrade futureBatchTrade(Symbol symbol, ContractType contractType, LeverRate leverRate, List<OrdersData> ordersDatas)throws Exception ;
	
	/**
	 * 取消合约订单
	 * @param symbol	币种标识
	 * @param contractType	合约类型
	 * @param order_id	订单ID 多个用逗号分隔,一次最多允许撤消3个订单
	 * @return
	 */
	FutureCancel futureCancel(Symbol symbol, ContractType contractType, Long order_id)throws Exception ;
	
	/**
	 * 获取合约订单信息
	 * @param symbol	币种标识
	 * @param contractType	合约类型
	 * @param tradeStatus	合约状态
	 * @param order_id		订单ID	-1:查询指定状态的订单，否则查询相应订单号的订单
	 * @param current_page	当前页数
	 * @param page_length	每页条数，不得超过50条
	 * @return
	 */
	FutureOrderInfo futureOrderInfo(Symbol symbol, ContractType contractType, TradeStatus tradeStatus, Long order_id, Integer current_page, Integer page_length)throws Exception ;

	/**
	 * 批量获取合约订单信息
	 * @param symbol		币种标识
	 * @param contractType	合约类型
	 * @param orders		多个订单ID用逗号分隔
	 * @return
	 */
	FutureOrdersInfo futureOrdersInfo(Symbol symbol, ContractType contractType, String orders)throws Exception ;
	
	/**
	 * 获取逐仓合约账户信息
	 * @return
	 */
	FutureUserinfo4fix futureUserinfo4fix()throws Exception ;
	
	/**
	 * 逐仓用户持仓查询
	 * @param symbol		币种标识
	 * @param contractType	合约类型
	 * @param leverRate		杠杆倍数
	 * @return
	 */
	FuturePosition4fix futurePosition4fix(Symbol symbol, ContractType contractType, LeverRate leverRate)throws Exception ;
	
	/**
	 * 获取合约爆仓单
	 * @param symbol		币种标识
	 * @param contractType	合约类型
	 * @param explosiveStatus	爆仓单状态
	 * @param current_page	当前页
	 * @param page_number	当前页		使用page_number时current_page失效，current_page无需传
	 * @param page_length	每页获取条数，最多不超过50
	 * @return
	 */
	FutureExplosive futureExplosive(Symbol symbol, ContractType contractType, ExplosiveStatus explosiveStatus, Integer current_page, Integer page_number, Integer page_length)throws Exception ;

	/**
	 * 个人账户资金划转
	 * @param symbol		币种标识
	 * @param devolveType	划转类型
	 * @param amount		划款数量
	 * @return
	 */
	FutureDevolve futureDevolve(Symbol symbol, DevolveType devolveType, Double amount)throws Exception ;

}
