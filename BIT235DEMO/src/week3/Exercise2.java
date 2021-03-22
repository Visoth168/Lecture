package week3;

import java.util.Scanner;
import java.util.Arrays;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int[] numbers = new int[3];

		System.out.println("Please enter three whole numbers.");

		System.out.print("Enter first number: ");

		numbers[0] = in.nextInt();

		System.out.print("Enter second number: ");

		numbers[1] = in.nextInt();

		System.out.print("Enter third number: ");

		numbers[2] = in.nextInt();

		Arrays.sort(numbers);

		System.out.println("In ascending order:");

		System.out.println(Arrays.toString( numbers));

	} 

	}


