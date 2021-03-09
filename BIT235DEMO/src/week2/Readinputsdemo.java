package week2;

import java.util.Scanner;
public class Readinputsdemo {
	public static void main(String []args)
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the value of a");
		double a=s.nextDouble();
		System.out.println("Enter the value of b");
		double b=s.nextDouble();
		System.out.println("Enter the value of c");
		double c=s.nextDouble();
		System.out.println("Enter the value of d");
		double d=s.nextDouble();
		System.out.println("Enter the value of e");
		double e=s.nextDouble();
		
		double sum = a+b+c+d+e;
		
		double average = sum/5;
		
		System.out.println("Enter Your Name");
		s.nextLine();
		String name=s.nextLine();
		
		System.out.println("Hello/n"+name+"!");
		System.out.println("Sum of the values entered is\t"+sum);
		System.out.println("average of the values entered is\t"+average);
		
	}	
	
}
