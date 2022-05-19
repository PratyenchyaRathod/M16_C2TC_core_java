package com.cg.regex;

import java.util.Scanner;

public class Example8 {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String str = "M-16\r\n Pratyenchya Rathod--Ankita--Hritik";
		String[] res = str.split("--"); 
		for(String i:res)
		{
			System.out.println(i);
		}

	}

}
