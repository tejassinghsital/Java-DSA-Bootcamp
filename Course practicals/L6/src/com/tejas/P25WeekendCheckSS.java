package com.tejas;
import java.util.Scanner;

public class P25WeekendCheckSS{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		String Weekdays=sc.nextInt();

		switch(Weekdays){

			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("Weekday.");
				break;
			case 6:
			case 7:
				System.out.println("Weekend.");
				break;
			default:
				System.out.println("Please enter valid week day.");
		}
	}
}