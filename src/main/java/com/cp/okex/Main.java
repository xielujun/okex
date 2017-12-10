package com.cp.okex;

import com.cp.okex.enums.ContractType;
import com.cp.okex.enums.LeverRate;
import com.cp.okex.enums.Symbol;
import com.cp.okex.stry.BaseStry;
import com.cp.okex.stry.FollowKLineStry;

public class Main {
	

	public static void main(String[] args) throws InterruptedException {
		BaseStry baseStry = new FollowKLineStry(Symbol.比特币, ContractType.当周, 100, LeverRate.倍20, 90d);
		baseStry.run();
	}

}
