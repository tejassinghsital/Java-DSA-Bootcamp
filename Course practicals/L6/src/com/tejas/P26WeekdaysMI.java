package com.tejas;
import java.util.Scanner;

public class P26WeekdaysMI{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		String Weekdays=sc.nextInt();

		if(Weekdays==1)
		{
			System.out.println("Monday");
		}

		else if(Weekdays==2)
		{
			System.out.println("Tuesday");
		}

		else if(Weekdays==3)
		{
			System.out.println("Wednesday");
		}

		else if(Weekdays==4)
		{
			System.out.println("Thursday");
		}

		else if(Weekdays==5)
		{
			System.out.println("Friday");
		}

		else if(Weekdays==6)
		{
			System.out.println("Saturday");
		}

		else if(Weekdays==7)
		{
			System.out.println("Sunday");
		}

		else{
			System.out.println("Please Enter a valid Weekday.");
		}
	}
}