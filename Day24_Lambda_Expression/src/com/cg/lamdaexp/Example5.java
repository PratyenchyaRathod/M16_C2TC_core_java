package com.cg.lamdaexp;
interface D
{
	int mul(int a, int b);
}

public class Example5 {

	public static void main(String[] args) 
	{
		//Lambda Expression without return statement
		D obj = (int a , int b)->(a*b);
		System.out.println("Multiplicationof a and b is "+obj.mul(20,10));
		
	}

}
