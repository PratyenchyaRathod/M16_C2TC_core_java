package com.cg.assignmentque;
//fibonacci Series 

public class Question1
{ 
	public static int fib(int n)
	{
		if(n==0)
		{
			return 0;
		}
		if(n==1 || n==2)
		{
			return 1;
		}
		return fib(n-1)+fib(n-2);
	}
	
	public static void main(String[] args) 
	{
		int n = 10;
		System.out.println(fib(n));

	}

}