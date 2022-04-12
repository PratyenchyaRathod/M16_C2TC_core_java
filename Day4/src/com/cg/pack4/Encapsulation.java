package com.cg.pack4;

import com.cg.pack3.SBI;

public class Encapsulation
{

	public static void main(String[] args) 
	{
		SBI obj = new SBI();
		obj.getBalance(50000);
		System.out.println(obj.getBalance());
		
	}

}
