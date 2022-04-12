package com.cg.oops;

public class Example3
{
   String name;
   Example3(String name)
   {
	   this.name=name;
   }
   void display()
   {
	   System.out.println("This is a " + name);
   }
	public static void main(String[] args)
	{
		Example2 e1 = new Example2("Chocolate Brownie");
		Example2 e2 = new Example2("Choco Chips");
		Example2 e3 = new Example2("Butter Scotch");
		Example2 e4 = new Example2("Black currant");
		Example2 e5 = new Example2("American nuts");
		e1.display();
		e2.display();
		e3.display();
		e4.display();
		e5.display();
	}

}
