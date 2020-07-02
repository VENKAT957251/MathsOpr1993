package com.testexecution.java;
//com.testexecution.java.CalculatortestNgparameter
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.main.program.Calculator;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
//import org.testng.annotations.AfterTest;
import org.testng.Reporter;

public class CalculatortestNgparameter extends Calculator{
	
	
	//Addition ,assertEquals, 
	  @Test(groups = {"MARS"})
	  @Parameters({"value1", "value2"}) 
	  public void Add(int value1,int value2) {
		  
		  int b = add(value1, value2);
		  System.out.println("addition of two num is = "+b);
		  Reporter.log("Addition Function executed  "+b, true);
		  Assert.assertEquals(b, 60);
	  }
	  
	  
	  //Substraction
	  @Test(groups = {"EARTH"})
	  @Parameters({"value1", "value2"}) 
	  private void Sub(int value1,int value2) {
	 	
	 int sub1 = sub(value1,value2);
	 System.out.println("substraction two num is  = "+sub1);
	 Reporter.log("Substraction Function executed  "+sub1, true);
	 Assert.assertEquals(sub1,20);
	 }
	   
	   //Division, assertNotEquals
	   @Test(groups = {"JUPITER"})
	   @Parameters({"value1", "value2"}) 
	   public void division(double value1,double value2) {
//	 	  double div1 = div(780,4);
//	 	  System.out.println("Division of two num is  = "+div1);
	 	  double div2 = div(value1,value2);
	 	  System.out.println("div2 is = "+div2);
	 	 Reporter.log("Division Function executed  "+div2, true);
	 	  
//	 	 Assert.assertNotEquals(div1, 190);
	 	 Assert.assertEquals(div2,2);
	   }
	   
	   
	   
	   //invertion,assertEquals
	   @Test(groups = {"JUPITER"})
	   @Parameters({"value1"}) 
	   private void invert(double value1) {
	 	  
	 	  double inv = Inverse(value1);
	 	  System.out.println("Inversion of a number is ="+inv);
	 	 Reporter.log("Inverse Function executed  "+inv, true);	 	  
	 	  Assert.assertEquals(inv, 0.025);
	 	   
	   }
	   
	   
	   //Modulus,assertNotequals
	   @Test(groups = {"EARTH"})
	   @Parameters({"value1", "value2"})
	   private void Modulus(int value1,int value2) {
	 	  
	 	  int mod1 = mod(value1,value2);
	 	  System.out.println("Modulus of a number is = "+mod1);
	 	 Reporter.log("Modulus Function executed  "+mod1, true);
	 	  Assert.assertNotEquals(mod1, 10);   
	   }
	   
	   //POW,assertTrue(true)
	   
	   @Test(groups = {"MARS"})
	   @Parameters({"value3", "value4"})
	   private void Powerof(double value3,double value4) {
	 	  
	 	  double b = Power(value3,value4);
	 	  System.out.println("a^(b) , power of a number  is = "+b);
//	 	  if(b==81)
//	 		  Assert.assertTrue(true);
	 	 Reporter.log("Power of  Function executed  "+b, true);
	 	  Assert.assertTrue(b==512);
	 		  
	   }
	   
	   //Multiplication
	   @Test(groups = {"MARS"})
	   @Parameters({"value3", "value4"})
	   private void Multiplication(int value3,int value4) {
	 	  
	 	  int b = mul(value3,value4);
	 	  System.out.println("Multiplicaiton of two numbers  is = "+b);
//	 	  if(b==81)
//	 		  Assert.assertTrue(true);
	 	 Reporter.log("Multiplication Function executed  "+b, true);
	 	  Assert.assertEquals(b, 512);
	 		  
	   }
	   
	   
	   
	 //POW,assertFalse(true)
	   
	   @Test(groups = {"JUPITER"})
	   @Parameters({"value3", "value4"})
	   private void Powerof1(double value3,double value4) {
	 	  
	 	  double b = Power(value3,value4);
	 	  System.out.println("a^(b) , power of a number  is = "+b);
//	 	  if(b==256)
	 	 Reporter.log("Power Function executed  "+b, true);
	 		  Assert.assertFalse(b!=532);
	 		  System.out.println("---------------------------------");
	   }
	   
	   
	   //Negat of number, assertFalse(false)
	   @Test(groups = {"EARTH"})
	   @Parameters({"value1"})
	   private void Negate(double value1) {
	 	  
	 	  double v = Negatitiv(value1);
	 	  System.out.println("negative of  given number is = "+v);
	 	 Reporter.log("Negat Function executed  "+v, true);
//	 	  if(v==(-178))
	 	  Assert.assertTrue(v==-148);
	 	  
	   }



}
