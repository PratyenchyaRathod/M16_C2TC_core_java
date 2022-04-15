package com.cg.inheritance;
class Samsung
{
	void accept()
	{
		System.out.println("Samsung Galaxy");
	}
}
class SamsungM31 extends Samsung
{
	void print()
	{
		System.out.println("samsung Galaxy-M31");
	}

	
	
}
class samsungM31s extends SamsungM31
{
	void display()
	{
		System.out.println("Samsung Galaxy-M31");
	}
}
public class multilevelinheritance {

	public static void main(String[] args) 
	{
	  SamsungM31 obj = new SamsungM31();
	  obj.accept();
	  obj.print();

	}

}
