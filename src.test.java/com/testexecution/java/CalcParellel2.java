package com.testexecution.java;
//com.testexecution.java.CalcParellel2
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.main.program.Calculator;

public class CalcParellel2 extends Calculator{

	
	
	//invertion,assertEquals
	  @Test
	  private void invert() {
		  
		  double inv = Inverse(50);
		  System.out.println("Inversion of a number is ="+inv);
		  Reporter.log("Invertion  Function executed  "+inv, true);
		  Assert.assertEquals(inv, 0.5);
		   
	  }
	  
	  
	  //Modulus,assertNotequals
	  @Test
	  private void Modulus() {
		  
		  int mod1 = mod(193, 10);
		  System.out.println("Modulus of a number is = "+mod1);
		  Reporter.log("Modulus  Function executed  "+mod1, true);
		  Assert.assertNotEquals(mod1, 3);   
	  }
	  
	  //POW,assertTrue(true)
	  
	  @Test
	  private void Powerof() {
		  
		  double b = Power(3, 4);
		  System.out.println("a^(b) , power of a number  is = "+b);
//		  if(b==81)
		  Reporter.log("Exponent Function executed  "+b, true);
			  Assert.assertTrue(b==81);
	  }
	  
	  
	  
	//POW,assertFalse(true)
	  
	  @Test
	  private void Powerof1() {
		  
		  double b = Power(4, 4);
		  System.out.println("a^(b) , power of a number  is = "+b);
//		  if(b==256)
		  Reporter.log("Exponent Function executed  "+b, true);
			  Assert.assertTrue(b==256);
	  }
	  
	  
	  //Negat of number, assertFalse(false)
	  @Test
	  private void Negate() {
		  
		  double v = Negatitiv(178);
		  System.out.println("negative of  given number is = "+v);
//		  if(v==(-178))
		  Reporter.log("Negate Function executed  "+v, true);
		  Assert.assertFalse(v==(-175));
		  
	  }
	
	
	
}
