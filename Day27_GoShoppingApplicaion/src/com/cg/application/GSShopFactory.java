package com.cg.application;

import com.cg.framework.ShopFactory;

public class GSShopFactory extends ShopFactory
{

	@Override
	public GSPrimeAcc getNewPrimeAcc(int accNo, String accNm, float charges, boolean isPrim) {
		GSPrimeAcc p=new GSPrimeAcc(accNo, accNm, charges, isPrim);
		return p;
	}

	@Override
	public GSNormalAcc getNewNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		GSNormalAcc n=new GSNormalAcc(accNo, accNm, charges, deliveryCharges);
		return n;
	}
	

	
}
