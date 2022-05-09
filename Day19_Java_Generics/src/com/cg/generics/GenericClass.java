package com.cg.generics;

public class GenericClass<T> 
 {
   T val;
   void print()
   {
	  System.out.println(val.getClass());
   }
  
	public static void main(String[] args)
	{
		GenericClass obj = new GenericClass<>();
		GenericClass obj1 = new GenericClass<>();
		GenericClass obj2 = new GenericClass<>();
		GenericClass obj3 = new GenericClass<>();
		obj.val = 12.5f;
		obj1.val = 10;
		obj2.val = 'A';
		obj3.val = "Pratyenchya";
		obj.print();
		obj1.print();
		obj2.print();
		obj3.print();
	}

}
