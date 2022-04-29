//Write a Java Code to check whether the input string matches with the word "Dhoni"

package com.cg.strings;

import java.util.Scanner;

public class Quetion {

	public static void main(String[] args)
	{
	 Scanner s = new Scanner(System.in);
	 String str = new String("Dhoni");
	 System.out.print("Not Matched");
	 System.out.println(str.matches(str));
	 

	}

}
