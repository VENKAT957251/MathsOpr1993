package com.main.program;

public class Calculator {

	//Substraction of two numbers
	public int sub(int a,int b) {
		int sub=a-b;
		return sub;
		}
	
	//Addition of two numbers
	public int add(int a,int b) {
		int add=a+b;
		return add;
		}
	
	//Multipliation of two numbers
	public int mul(int a,int b) {
		int mul =a*b;
		return mul;
		}
	
	
	//Division of two numbers
	public double div (double a,double b) throws ArithmeticException {
		try {
			double c = a/b;
			return c;
		}
		catch (ArithmeticException e) {
			System.out.println("number dividend can't be devided by 0 ");
	    }
		return b;
		
	}
	
	
	// Exponent function(Power of number)
	   public  double Power(double number1, double number2)  {
		   try {
			   double c = Math.pow(number1, number2);
			   return c;
		   }
			catch (ArithmeticException e) {
				System.out.println("number given is invalid");
		    }
		return number2;
	   }
	   
	   
	   
	   
	   //Modulos function
		public  int mod(int number1, int number2)  {
			
			  try {
			  int c=number1%number2;
		      return c;
			  }
			  catch(ArithmeticException e){
					System.out.println("number dividend can't be devided by 0 ");
				}
			return number2;
					
		   }
		
		//Inverse of Number
		public  double Inverse(double num) {
			
			
			try {
				  double c=(1/num);
			      return c;
				  }
				  catch(ArithmeticException e){
						System.out.println("number dividend can't be devided by 0 ");
					}
				return num;
			
			
		}
	   
	   
		
		//Negative of Number
		public double Negatitiv(double num) {
			
				  double c = (-1)*(num);
			      return c;
			}
	
	
}
	

