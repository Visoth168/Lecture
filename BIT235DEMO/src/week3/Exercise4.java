package week3;

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num = 1;
		    int square;
		    int sum = 0;
		    while (num * num < 100) {
		        square = (num * num);
		        sum = sum + square;
		        num++;
		    }
		    System.out.println(sum);
		}
	}


