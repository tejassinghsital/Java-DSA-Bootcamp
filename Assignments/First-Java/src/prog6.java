/*
6. Take 2 numbers as input and print the largest number.
*/
import java.util.Scanner;
public class Prog6
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		int n= sc.nextInt();

		System.out.println("ENter 2nd number: ");
		int m= sc.nextInt();

		if(n>m)
			System.out.println(n+" is grreater than "+ m);
		else
			System.out.println(m+" is grreater than "+ n);
	}
}