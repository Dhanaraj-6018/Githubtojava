package com.dataprovider;

import org.testng.Assert;
import org.testng.annotations.*;

public class Dependsonmethodexample {

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod()");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod()\n");
	}

	@Test
	public void testAdd() {
		System.out.println("testAdd()");
		
	}

	@Test
	public void testDivide() {
		System.out.println("testDivide()");
	
	}

	@Test(dependsOnMethods = { "testDivide", "testAdd" })
	public void testProcessRealNumbers() {
		System.out.println("testProcessRealNumbers()");
	}

	@Test(dependsOnMethods={"testAdd", "testDivide"})
    public void testProcessEvenNumbers() {
        System.out.println("testProcessEvenNumbers()");
    }
}
