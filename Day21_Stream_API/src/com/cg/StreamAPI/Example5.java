package com.cg.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example5 {

	public static void main(String[] args) {
		List<Integer>obj = Arrays.asList(10,20,30,12,17,6,5,34);
		List<Integer>obj2=obj.stream().map(i->i*i).collect(Collectors.toList());
		System.out.println(obj2);
		
	}

}
