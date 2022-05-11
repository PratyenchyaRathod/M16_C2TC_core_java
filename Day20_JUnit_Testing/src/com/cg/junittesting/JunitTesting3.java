package com.cg.junittesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
@Disabled
public class JunitTesting3 {
	@Test
	void print()
	{
		int a=1;
		int b=1;
		assertEquals(a,b);
	}
	@Test
	void print1()
	{
		int a=1;
		int b=2;
		assertEquals(a,b);
	}


}
