package week3;

import java.util.Scanner;

public class Switchdemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Your Day of Birth");
		int month=s.nextInt();
	switch(month)
	{
	case 1:
	{
		System.out.println("Jan");
		break;
	}
	case 2:
	{
		System.out.println("Feb");
		break;
	}
	case 3:
	{
		System.out.println("Mar");
		break;
	}
	case 4:
	{
		System.out.println("Apr");
		break;
	}
	case 5:
	{
		System.out.println("May");
		break;
	}
	case 6:
	{
		System.out.println("Jun");
		break;
	}
	case 7:
	{
		System.out.println("Jul");
		break;
	}
	case 8:
	{
		System.out.println("Aug");
		break;
	}
	case 9:
	{
		System.out.println("Sep");
		break;
	}
	case 10:
	{
		System.out.println("Oct");
		break;
	}
	case 11:
	{
		System.out.println("Nov");
		break;
	}
	case 12:
	{
		System.out.println("Dec");
		break;
	}
	default:
	{
		System.out.println("Invalid Month");
	}
	}
		
	}

}

	


