package com.cg.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Example3 {

	public static void main(String[] args) 
	{
		List<Integer>obj = Arrays.asList(10,20,30,12,17,6,5,34);
		obj.stream().distinct().forEach(System.out::println);
		System.out.println("Distinct Output");
		obj.stream().limit(5).forEach(System.out::println);
		System.out.println("Skip Output");
		obj.stream().skip(3).forEach(System.out::println);
		System.out.println("Sorting Output");
		obj.stream().sorted().forEach(System.out::println);
	}
}
