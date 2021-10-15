package com.tejas;
import java.util.Scanner;

public class P31MethodSumSameClass{
	public static void main(String[] args)
	{
		
		P31MethodSum obj=new P31MethodSum();
		obj.sumfx(); // This two lines can be used to call a fx from any class by making it's object and static used in function making or not doesn't matter.
		//or
		sumfx();// this can use only when you used static in function making. 

			
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