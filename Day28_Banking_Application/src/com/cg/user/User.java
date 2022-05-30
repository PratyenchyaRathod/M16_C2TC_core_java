package com.cg.user;

import com.cg.application.MMBankFactory;
import com.cg.application.MMCurrentAcc;
import com.cg.application.MMSavingAcc;
import com.cg.framework.BankFactory;
import com.cg.framework.CurrentAcc;
import com.cg.framework.SavingAcc;

public class User {

	public static void main(String[] args) 
	{
	 BankFactory b = new MMBankFactory();
	 SavingAcc s = new MMSavingAcc(111,"Pratyenchya",1000,true);
	 CurrentAcc c = new MMCurrentAcc(112,"Jayshree",2000,500);
	 System.out.println("Saving Account ");
	 s.withdraw(s.getAccBal());
	 System.out.println("Current Account");
	 c.withdraw(c.getAccBal());
	 System.out.print(s);
	 System.out.println(c);
	}

}
