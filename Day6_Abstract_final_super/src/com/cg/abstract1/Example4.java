package com.cg.abstract1;

 class Parent1
{
	 void accept()
	{
		System.out.print("Parent");
	}
}
class Child1 extends Parent
{
	void accept()
	{
		System.out.print("Child");
	}
}
public class Example4 {

	public static void main(String[] args)
	{
         Child1 c = new Child1();
         Parent1 p = new Parent1();
         c.accept();
         p.accept();
	}

}
