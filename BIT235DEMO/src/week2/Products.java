package week2;

import java.util.Scanner;

public class Products {
	
	 public static void main(String []args){
	   
		   Scanner s = new Scanner(System.in);
		   System.out.println("Enter the first string");
		  String first=s.nextLine();
		  
		  System.out.println("Enter the secound string");
		  String secound=s.nextLine();
			 
		  if (first.equals(secound))
		  {
			  System.out.println("true");
		  }
		  else 
			  System.out.println("fales");
	   }
	}

