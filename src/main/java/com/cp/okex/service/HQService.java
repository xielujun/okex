package com.cp.okex.service;

public interface HQService {
	
	/**
	 * 获取买一价
	 * @return
	 */
	Double getBuy();
	
	/**
	 * 获取卖一价
	 * @return
	 */
	Double getSell();
	
	/**
	 * 获取合并后的买一价
	 * @return
	 */
	Double getMergeBuy();
	
	/**
	 * 获取合并后的卖一价
	 * @return
	 */
	Double getMergeSell();
	
}
