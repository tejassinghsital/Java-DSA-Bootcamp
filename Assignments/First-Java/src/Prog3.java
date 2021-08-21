/*
3. Take name as input and print a greeting message for that name.
*/
import java.util.Scanner;
public class Prog3
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("What's your name?: ");
		String s=sc.nextLine();

		System.out.println("Hello, "+s+" How's your day?");
	}
}