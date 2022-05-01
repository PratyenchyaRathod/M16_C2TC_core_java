package com.cg.collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class Example4 {

	public static void main(String[] args) 
	{
		int i;
		Queue<Integer> q = new PriorityQueue<Integer>();
		for(i=10 ; i>0; i--)
		{
			q.add(i);
		}
		System.out.println(q);
		

	}

}
