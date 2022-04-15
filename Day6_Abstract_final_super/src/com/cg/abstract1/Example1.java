package com.cg.abstract1;
abstract class A
{
	abstract void print();
}
class B extends A
{
	void print()
	{
		System.out.println("Welcom to JFS program");
	}
}
public class Example1 {

	public static void main(String[] args)
	{
		A obj = new B();
		obj.print();
		
	}

}
