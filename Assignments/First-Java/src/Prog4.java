/*
4. Write a program to input principle, time and rate (P, T, R) from user and
find Simple Interest.
*/
import java.util.Scanner;
public class Prog4
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter principal amount: ");
		float p= sc.nextFloat();
		System.out.println("Enter interest percentage: ");
		int r=sc.nextInt();
		System.out.println("Enter time in years: ");
		int t= sc.nextInt();

		int s=(p*r*t)/100;
		System.out.println("Simple Interest for above provided data is: "+s);

	}
}