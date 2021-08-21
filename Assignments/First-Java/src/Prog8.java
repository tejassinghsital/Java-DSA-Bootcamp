/*
8. Input currency in rupee and output in dollar.
*/
import java.util.Scanner;
public class Prog8
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter currency in rupees: ");
		double d= sc.nextDouble();

		double c=d/74.30;
		System.out.println("Equivalent Dollar Amount is: "+ c);
	}
}