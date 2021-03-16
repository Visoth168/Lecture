package week2;

import java.util.Scanner;

public class Fuelconsumption {
	public static void main(String []args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the full feul: ");
		double feul = input.nextDouble();
		System.out.print("Enter liters per 100km: ");
		double kiloPerLiter = input.nextDouble();
		

		
		double Feulnormal = (feul / kiloPerLiter) * 100;
		
		double Feulroughroad = feul /( kiloPerLiter * 0.15 + kiloPerLiter) * 100;
		
		// Display result
		System.out.println("The distance on normal road of Full Feul can run KM" + Feulnormal);
		System.out.println("The distance on rough road +15% of Full Feul can run KM" + Feulroughroad);
	}	
}
