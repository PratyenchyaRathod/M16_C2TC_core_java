package com.cg.enum1;

public class Example5 
{
	enum EmpType
	{
		Contract,Permanent,Temporary;
	}
	static void print(EmpType e)
	{
		if(e==EmpType.Contract)
		{
			System.out.println("Contract-Based Employee");
		}
		else if(e==EmpType.Permanent)
		{
			System.out.println("Permanent Employee");
		}
		else
		{
			System.out.println("Temporary Employee");
		}
	}

	public static void main(String[] args)
	{
		EmpType e = EmpType.Contract;
		print(e);
	}
}