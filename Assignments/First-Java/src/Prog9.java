/*
9. Take integer inputs till the user enters 0 and print the sum of all numbers
(HINT: while loop)
*/
import java.util.Scanner;
public class Prog9
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter continous series of numbers(Exit with 0): ");
		int i=0;
		int s=0;
		while((i=sc.nextInt()) != 0)
		{
			s=i+s;	
		}
	System.out.println("The sum of all entered numbers are: "+s);
	}
}