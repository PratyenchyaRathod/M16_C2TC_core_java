package com.cg.junittesting;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class JUnitTesting4 
{
	@BeforeAll
 void display()
 {
	 System.out.println("Samiksha");
	 
 }
	@Tag("Diya")
	@Disabled
	@Test
	void display1()
	{
		System.out.println("Kamal");
	}
}
