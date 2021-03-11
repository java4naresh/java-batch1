package com.naresh.junit.test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class AdditionTest {
             
	 Addition add;
	
	@Before
	public void Put() {
		add=new Addition();
	}
	
	@Test
	public void addTest() {
		int sum=add.add(10, 5);
		
		assertEquals(15, sum);
		assertTrue(15==sum);
		/*
		 * int sum2=add.add(5, 5); assertEquals(6, sum2);
		 */
	}
		@Test
		public void CalTest() {
		int actul=add.Cal(100, 10);
		assertEquals(-990,actul);
		assertTrue(-990==actul);
		  
		}
		
		
	
		
		
		
		
		
	
}
