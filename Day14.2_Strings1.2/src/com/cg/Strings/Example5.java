package com.cg.Strings;

import java.util.StringTokenizer;

public class Example5 {

	public static void main(String[] args)
	{
		StringTokenizer st = new StringTokenizer("Let's try this");
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
		

	}

}
