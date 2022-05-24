package com.cg.framework;

public abstract class ShopFactory
{
	abstract public PrimeAcc getNewPrimeAcc(int accNo, String accNm, float charges, boolean isPrim);
	abstract public NormalAcc getNewNormalAcc(int accNo, String accNm, float charges, float deliveryCharges);

}
