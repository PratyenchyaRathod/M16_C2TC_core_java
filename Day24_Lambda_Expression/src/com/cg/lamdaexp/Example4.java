package com.cg.lamdaexp;

import java.util.LinkedList;

public class Example4 {

	public static void main(String[] args) 
	{
		LinkedList<Integer> obj = new LinkedList<>();
		obj.add(11);
		obj.add(22);
		obj.add(33);
		System.out.println(obj);
		obj.forEach((n)->
		{
			System.out.println(n);
		});
		

	}

}
