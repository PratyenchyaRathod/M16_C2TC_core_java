package com.cg.generics;

import java.util.ArrayList;
import java.util.Iterator;

public class Example3 {

	public static void main(String[] args) 
	{
		ArrayList<String> A = new ArrayList<String>();
		A.add("Pratyenchya");
		A.add("Rathod");
		String res = A.get(1);
		System.out.println( res);
		System.out.println(A);
		Iterator<String> itr = A.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
