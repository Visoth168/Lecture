package week3;

import java.util.Scanner;
public class Switchdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the person age in integer value");
		int age=s.nextInt();
	switch(age)
	{
	case 0:
	{
		System.out.println("the person is not yet born");
		break;
	}
	case 5:
	{
		System.out.println("the person is a child");
		break;
	}
	case 10:
	{
		System.out.println("the person is an adelosent");
		break;
	}
	case 13:
	{
		System.out.println("the person is a teenager");
		break;
	}
	case 18:
	{
		System.out.println("the person is an adult");
		break;
	}
	case 55:
	{
		System.out.println("the person is a senior citizen");
		break;
	}
	default:
	{
		System.out.println("Not interesting age");
	}
	}
		
	}

}
