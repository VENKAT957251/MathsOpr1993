package com.testexecution.java;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.main.program.Calculator;

public class CalcParellel1 extends Calculator{
 
	
	//Addition ,assertEquals, 
	  @Test
	  private void Add() {
		  
		  int b = add(40, 40);
		  System.out.println("addition of two num is = "+b);
		  Reporter.log("AdditionFunction executed  "+b, true);
		  Assert.assertEquals(b, 80);
		 
	  }
	
	 
	  
	//Multiplication
	   @Test
	   private void Multiplication() {
	 	  
	 	  int b = mul(5,4);
	 	  System.out.println("a*b   of two numbers  is = "+b);
//	 	  if(b==81)
//	 		  Assert.assertTrue(true);
	 	 Reporter.log("Multipication executed  "+b, true);
	 	  Assert.assertEquals(b, 20,"First hard assert failed");
	 		  
	   }
	 
	   
	   // substartion, assertEquals
@Test
private void Sub() {
	
int sub1 = sub(6,5);
System.out.println("substraction two num is  = "+sub1);
Reporter.log("Substraction Function executed  "+sub1, true);
Assert.assertEquals(sub1,1);
}

//Division, assertNotEquals
@Test
private void div() {
//	  double div1 = div(780,4);
//	  System.out.println("Division of two num is  = "+div1);
	  double div2 = div(44,2);
	  System.out.println("div2 is = "+div2);
	  
//	 Assert.assertNotEquals(div1, 190);
	  Reporter.log("Division Function executed  "+div2, true);
	 Assert.assertEquals(div2,21);
}

	
	
	
	
	
}
