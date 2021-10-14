package com.tejas;
import java.util.Scanner;

public class P21MulIfConditions{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		String fruit=sc.next();

		if(fruit.equals("Mango"))
		{
			System.out.println("King of fruits.");
		}

		if(fruit.equals("Apple"))
		{
			System.out.println("A sweet red fruit.");
		}
	}
}