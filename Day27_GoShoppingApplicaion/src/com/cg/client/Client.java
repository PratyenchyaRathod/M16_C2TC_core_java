package com.cg.client;

import com.cg.application.GSNormalAcc;
import com.cg.application.GSPrimeAcc;
import com.cg.application.GSShopFactory;
import com.cg.framework.NormalAcc;
import com.cg.framework.PrimeAcc;
import com.cg.framework.ShopFactory;

public class Client {

	public static void main(String[] args) 
	{
		ShopFactory s= new GSShopFactory();
		PrimeAcc p = new GSPrimeAcc(123,"Ankita",500,true);
		NormalAcc n=new GSNormalAcc(124,"Pratyenchya",550,50);
		System.out.println("Prime account");
		p.bookProduct(p.getCharges());
		System.out.println("Normal account");
		n.bookProduct(n.getCharges());
		System.out.println(p);
		System.out.println(n);
		
	}

}
