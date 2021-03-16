package week2;

import java.util.Scanner;

public class CompoundInterest {
	public static void main(String []args)
	{
		 Scanner s = new Scanner(System.in);
	      
		double amount;
		double principal;
		double rate; 
		double time; 
		
		System.out.print("Enter Principal amount : ");
	      principal = s.nextDouble();
	      
	    System.out.print("Enter the rate : ");
	      rate = s.nextDouble();
	      
	    System.out.print("Enter the time : ");
	     time = s.nextDouble();
	    
	    amount = principal * Math.pow(1 + rate / 100, time); 
	    System.out.print("The Compound Interest is : " + amount );
	}	
}
