package com.cg.application;

import com.cg.framework.BankFactory;
import com.cg.framework.CurrentAcc;
import com.cg.framework.SavingAcc;

public class MMBankFactory extends BankFactory
{
   public MMSavingAcc getNewSavingAcc(int accNo, String accNm, float accBal,boolean isSalaried) {
		MMSavingAcc s=new MMSavingAcc(accNo, accNm, accBal,isSalaried);
		return s;
	}
	public MMCurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		MMCurrentAcc c=new MMCurrentAcc(accNo, accNm, accBal,creditLimit);
		return c;
	}

}
 

