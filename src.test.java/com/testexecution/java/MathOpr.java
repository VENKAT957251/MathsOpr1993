package com.testexecution.java;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.main.program.Calculator;



public class MathOpr extends Calculator{
	
	//Addition ,assertEquals, 
	  @Test
	  private void Add() {
		  
		  int b = add(20, 40);
		  System.out.println("addition of two num is = "+b);
		  Assert.assertEquals(b, 60);
		  Reporter.log("TestNG_ReportsAndLogs -> Add"+b, true);
	  }
	
	 
	  
	//Multiplication
	   @Test
	   private void Multiplication() {
	 	  
	 	  int b = mul(5,4);
	 	  System.out.println("a*b   of two numbers  is = "+b);
//	 	  if(b==81)
//	 		  Assert.assertTrue(true);
	 	 Reporter.log("Multiplication Function executed  "+b, true);
	 	  Assert.assertEquals(b, 512);
	 	  		  
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
	 Assert.assertEquals(div2,22);
  }
  
  
  
  //invertion,assertEquals
  @Test
  public void invert() {
	  
	  double inv = Inverse(156);
	  System.out.println("Inversion of a number is ="+inv);
	  Reporter.log("Inverse Function executed  "+inv, true);
	  Assert.assertEquals(inv, 0.00641025641025641);
	   
  }
  
  
  //Modulus,assertNotequals
  @Test
  private void Modulus() {
	  
	  int mod1 = mod(193, 10);
	  System.out.println("Modulus of a number is = "+mod1);
	  Reporter.log("Modulus Function executed  "+mod1, true);
	  
	  Assert.assertNotEquals(mod1, 10);   
  }
  
  //POW,assertTrue(true)
  
  @Test
  private void Powerof() {
	  
	  double b = Power(3, 4);
	  System.out.println("a^(b) , power of a number  is = "+b);
	  Reporter.log("Power of  Function executed  "+b, true);
//	  if(b==81)
		  Assert.assertTrue(b==81);
  }
  
  
  
//POW,assertFalse(true)
  
  @Test
  private void Powerof1() {
	  
	  double b = Power(4, 4);
	  System.out.println("a^(b) , power of a number  is = "+b);
//	  if(b==256)
	  Reporter.log("Power Function executed  "+b, true);
		  Assert.assertFalse(b==16);
  }
  
  
  //Negat of number, assertFalse(false)
  @Test
  private void Negate() {
	  
	  double v = Negatitiv(178);
	  System.out.println("negative of  given number is = "+v);
//	  if(v==(-178))
	  Reporter.log("negat Function executed  "+v, true);
	  Assert.assertFalse(v!=-78);
	  
  }
}
