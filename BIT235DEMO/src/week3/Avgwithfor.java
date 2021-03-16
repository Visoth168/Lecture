package week3;

import java.util.Scanner;
public class Avgwithfor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			Scanner s=new Scanner(System.in);
			
			System.out.println("Enter the number of values you want to read");
			int number_of_value = s.nextInt();
			int sum = 0;
			double average;
			
			for(int i=1; i<=number_of_value; i++)
			{
				System.out.println("Enter "+i+" number");
				int number = s.nextInt();
				sum+=number; //sum=sum+number
				
			}
			average=sum/number_of_value;
			System.out.println("Sum is\t: "+sum);
			System.out.println("average is\t: "+average);
			
			
		}

	}


