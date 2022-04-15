package com.cg.instanceof1;

public class Example1 
{
 class Example2
 {
	 void print()
	 {
		 System.out.println("Hello");
	 }
 }
	public static void main(String[] args)
	{
		Example1 e = new Example1();
		System.out.println(e instanceof Example1);
				
	}

}
