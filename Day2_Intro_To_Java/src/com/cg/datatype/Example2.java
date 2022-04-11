package com.cg.datatype;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		float b = s.nextFloat();
		double c = s.nextDouble();
		String d = s.next();
		char e = s.next().charAt(0);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		s.close();
		
		
		

	}

}
