/*
2. Write a program to print whether a number is even or odd, also take
input.
*/
import java.util.Scanner;
public class Prog2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n= sc.nextInt();

		if(n%2==0)
			System.out.println("The number "+n+" is Even.");
		else
			System.out.println("The number "+n+" is Odd.");
	}
}