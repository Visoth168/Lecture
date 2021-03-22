package week3;
import java.util.Scanner;
public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
		    int integer = 0;

		    System.out.println("Enter a number between 0 - 35: ");
		    integer = in.nextInt();

		    if(integer <= 9){
		        System.out.println("Number entered is " + integer);
		    }
		    else{

		    	System.out.println((char)((byte)'A' + (integer - 10)) );
		                                                            
		    }
		}//END Main
		}

