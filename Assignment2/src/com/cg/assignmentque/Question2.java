package com.cg.assignmentque;

import java.util.Scanner;

//Digit sum of numbers

public class Question2 
{
	public static int SumOfDigit(int n)
	{
	  if (n == 0)
		  return 0;
	  return ( n % 10 + SumOfDigit(n/10));
	}
	
	public static void main(String[] args)
	{ 
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number :");
		n = s.nextInt();
		Question2 obj = new Question2();
		int a = obj.SumOfDigit(n);
		System.out.println("sum of digit is :"+a);
	}
}
