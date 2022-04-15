package com.cg.abstract1;
class Parent
{
	void accept()
	{
		System.out.print("Parent");
	}
}
class Child extends Parent
{
	void print()
	{
		System.out.print("Child");
	}
}
public class Example3 {

	public static void main(String[] args)
	{
	Child c = new Child();
	c.print();
	}

}
