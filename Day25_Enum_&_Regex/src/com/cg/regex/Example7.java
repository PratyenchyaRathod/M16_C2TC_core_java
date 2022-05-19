package com.cg.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example7 {

	public static void main(String[] args) 
	{
		Pattern p = Pattern.compile("Programming");
		Pattern p1 = Pattern.compile("Job");
		Matcher m = p.matcher("Java Programming is enough to gt job in IT industry");
		Matcher m1 = p1.matcher("Java Programming is enough to gt job in IT industry");
		
		while(m.find())
		{
			System.out.println("Pattern found from : "+m.start()+ " to " +(m.end()-1));
		}
		while(m1.find())
		{
			System.out.println("Pattern found from : "+m1.start()+ " to " +(m1.end()-1));
		}
		System.out.println("Nothing");
	}
}
 