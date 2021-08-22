/*
1. Write a program to print factorial of a number, also take input.
*/
import java.util.Scanner;
public class Prog1
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n= sc.nextInt();

		int c=1;
		for(int i=1; i<=n;i++)
		{

			c*=i;//c=c*i;
		}
	System.out.println("The factorial of "+n+" is: "+ c);
	}
}