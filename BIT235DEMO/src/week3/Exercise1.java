package week3;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int time = s.nextInt();
		if (time < 18) {
		  System.out.println("Good day.");
		} else {
		  System.out.println("Good evening.");
		}

	}

}
