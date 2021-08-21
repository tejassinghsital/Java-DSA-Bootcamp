/*
5. Take in two numbers and an operator (+, -, *, /) and calculate the value.
(Use if conditions)
*/
import java.util.Scanner;
public class Prog5
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		int num1=sc.nextInt();
		System.out.println("Enter 2nd number: ");
		int num2=sc.nextInt();
		System.out.println("Select an operator(+,-,*,/): ");
		char s=sc.next().charAt(0); 

		int t;
		if(s=='+')
		{
			t=num1+num2;
		}
		else if(s=='-')
		{
			t=num1-num2;
		}
		else if(s=='*')
		{
			t=num1*num2;
		}
		else 
		{
			t=num1/num2;
		}
		System.out.println("The "+s+" of "+num1+" and "+num2+" is:"+ t);
	}
}