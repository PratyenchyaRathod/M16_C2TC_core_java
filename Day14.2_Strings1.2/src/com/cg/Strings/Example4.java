package com.cg.Strings;

import java.util.StringTokenizer;

public class Example4 {

	public static void main(String[] args)
	{
		StringTokenizer st = new StringTokenizer("Merry Go Round");
		StringTokenizer st1 = new StringTokenizer("Hi-Saana", "-");
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st1.nextToken());
		
	}

}
