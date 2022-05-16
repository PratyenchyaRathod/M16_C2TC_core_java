package com.cg.datetimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Example1 {

	public static void main(String[] args) 
	{
		//LocalDate d =  LocalDate.now();
		//LocalTime t = LocalTime.now();
		LocalDateTime DT = LocalDateTime.now();
		LocalDate obj = LocalDate.of(2022, 2, 28);
		//System.out.println(d);
		//System.out.println(t);
		System.out.println(DT);
		System.out.println(obj);
	}

}
