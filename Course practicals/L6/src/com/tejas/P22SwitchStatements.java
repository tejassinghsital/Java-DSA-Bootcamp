package com.tejas;
import java.util.Scanner;

public class P22SwitchStatements{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		String fruit=sc.next();

		switch(fruit){

			case "Mango": 
				System.out.println("King of fruits.");
				break;

			case "Apple":
				System.out.println("A sweet red fruit.");
				break;

			case "Banana": 
				System.out.println("An yellow fruit with lot's of carbohydrates.");
				break;

			case "Orange":
				System.out.println("An fruit with same name as orange colour.");
				break;

			default:
				System.out.println("Please enter valid fruit name.");
		}
	}
}