package com.cg.application;

import com.cg.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc
{

	public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrim) 
	{
		super(accNo, accNm, charges, isPrim);
	}

	@Override
	public String toString() {
		return String.format("GSPrimeAcc [toString()=%s]", super.toString());
	}
	
 
}
