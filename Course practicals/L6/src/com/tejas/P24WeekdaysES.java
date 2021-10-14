package com.tejas;
import java.util.Scanner;

public class P24WeekdaysES{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		String Weekdays=sc.nextInt();

		switch(Weekdays){

			case 1 -> {
				System.out.println("Monday");
			}// you can also write it in bracketrs for multiple statements...
			case 2 -> System.out.println("Tuesday");
			case 3 -> System.out.println("Wednesday");
			case 4 -> System.out.println("Thursday");
			case 5 -> System.out.println("Friday");
			case 6 -> System.out.println("Saturday");
			case 7 -> System.out.println("Sunday");
			default -> System.out.println("Enter valid Week Day.");
		}
	}
}