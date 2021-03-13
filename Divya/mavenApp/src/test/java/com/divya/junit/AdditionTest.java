package com.divya.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AdditionTest 
{
	Addition addition;
	
	@Before
	public void setup()
	{
		addition=new Addition();
	}
	@Test
	public void addTest()
	{
		int sum=addition.add(20, 30);
		assertEquals(50,sum);
		sum=addition.add(-50, 30);
		assertEquals(-20,sum);
		sum=addition.add(0,-10);
		assertTrue(-10==sum);
	}
	@Test
	public void subTest()
	{
		int sub=addition.sub(50,30);
		assertEquals(20,sub);
		sub=addition.sub(-50,10);
		assertEquals(-60,sub);
	}
	@Test
	public void arithmeticTest()
	{
		int total=addition.arithmetic(100,50);
		assertEquals(5202,total);
	}
}
