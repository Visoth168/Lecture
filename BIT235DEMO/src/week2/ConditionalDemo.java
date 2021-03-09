package week2;
	import java.util.Scanner; 
public class ConditionalDemo {
	
   public static void main(String []args)
   {
	   Scanner s = new Scanner(System.in);
	   
	   System.out.println("Enter a integer value");
	   int a = s.nextInt();
	   
	   if(a>0)
	   {
		   System.out.println(a+"\t is a positive number");
	   }
	   else if(a<0)
	   {
		   System.out.println(a+"\t is a negative number");
	   }
	   else{
		   System.out.println(a+"\t is equal to zero");
	   }
		 
   }
}
