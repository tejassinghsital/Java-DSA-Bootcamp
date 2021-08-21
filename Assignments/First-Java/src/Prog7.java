/*
7. Input a number and print all the factors of that number (use loops).
*/
import java.util.Scanner;
public class Prog7
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();

		System.out.println("Below are the factors of "+ n);
		for(int i=1; i<=n;i++)
		{
			int f=n%i;

			if(f==0)
				System.out.print(i+" ");
			else
				continue;
		}
	}
}