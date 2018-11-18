package com.dataprovider;

import org.testng.annotations.Test;

public class Enableanddisable {
	
	@Test(enabled=true)
	public void testOne()
	{
		System.out.println("value is 1");
	}
	
	@Test(enabled=true)
	public void tesTwo()
	{
		System.out.println("value is 2");
	}
	
	
	@Test(enabled=true)
	public void testThree()
	{
		System.out.println("value is 3");
	}
	
	
	@Test(enabled=false)
	public void testFour()
	{
		System.out.println("value is 4");
	}
	
	@Test(enabled=true)
	public void testFive()
	{
		System.out.println("value is 5");
	}

	
	
}
