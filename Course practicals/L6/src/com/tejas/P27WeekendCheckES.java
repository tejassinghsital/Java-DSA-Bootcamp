package com.tejas;
import java.util.Scanner;

public class P24WeekdaysES{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		String Weekdays=sc.nextInt();

		switch(Weekdays){
 
			case 1,2,3,4,5 -> System.out.println("Weekday.");
			case 6,7 -> System.out.println("Weekend");
			default -> System.out.println("Enter valid Week Day.");
		}
	}
}