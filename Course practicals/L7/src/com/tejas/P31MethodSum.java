package com.tejas;
import java.util.Scanner;

public class P31MethodSum{
	public static void main(String[] args)
	{
		
		sumfx();

			
	}

	public  static void sumfx(){

		Scanner sc= new Scanner(System.in);
		System.out.print("Enter 1st number: ");
		int num1= sc.nextInt();

		System.out.print("Enter 2nd number: ");
		int num2= sc.nextInt();

		int sum= num1+num2;
		System.out.println("The sum is: "+ sum);
	}
}