package com.tejas;
import java.util.Scanner;

public class P23EnhancedSwitch{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		String fruit=sc.next();

		switch(fruit){

			case "Mango" -> System.out.println("King of fruits.");
			case "Apple" -> System.out.println("A sweet red fruit.");
			case "Banana" -> System.out.println("An yellow fruit with lot's of carbohydrates.");
			case "Orange" -> System.out.println("An fruit with same name as orange colour.");
			default -> System.out.println("Please enter valid fruit name.");
		}
	}
}