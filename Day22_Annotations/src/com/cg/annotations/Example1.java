package com.cg.annotations;
 class A
 {
	 void display()
	 {
		 System.out.println("Parent Class");
	 }
 }
 class B extends A
 {
	 @Override
    void display()
     {
	   System.out.println("Parent Class"); 
     }
 }
public  class Example1 
{

	public static void main (String[] args) 
	{
		B obj = new B();
		obj.display();
	}
}
