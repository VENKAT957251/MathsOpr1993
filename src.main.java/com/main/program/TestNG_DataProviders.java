package com.main.program;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG_DataProviders extends Calculator {
	
	@DataProvider(name="inputs")
	public Object[][] getData() {
		return new Object[][] { {4, 2}, {8, 2}, {90, 10} };
	}
	
	
	@DataProvider(name="inputs1")
	public Object[] getData1() {
		return new Object[] {4,25,50};
	}
	
	/*
	 * @Test(dataProvider="inputs") public void testMethod1(double input1, double
	 * input2) { // System.out.println("Input 1: " + input1); //
	 * System.out.println("Input 2: " + input2);
	 * 
	 * double c = div(input1, input2); System.out.println(c); //
	 * Assert.assertEquals(c, 2); // Assert.assertTrue(true); if(c==2)
	 * Assert.assertFalse(false);
	 * 
	 * }
	 */
	
	
	/*
	 * @Test(dataProvider="inputs1") public void testMethod2(double input1) { //
	 * System.out.println("Input 1: " + input1); // System.out.println("Input 2: " +
	 * input2);
	 * 
	 * double c = Inverse(input1); System.out.println(c); Assert.assertNotEquals(c,
	 * 0.25);
	 * 
	 * }
	 */
	
}