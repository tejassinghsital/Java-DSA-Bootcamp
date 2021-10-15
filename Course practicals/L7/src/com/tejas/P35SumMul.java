package com.tejas;
import java.util.Scanner;

public class P35SumMul{
	public static void main(String[] args)
	{
		int mul=sumfx();
		mul=mul*2;
		System.out.println(mul);
			
	}

	public static int sumfx(){

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st number: ");
		int num1=sc.nextInt();

		System.out.print("Enter 2nd number: ");
		int num2=sc.nextInt();

		int sum=num1+num2;
		return sum;
	}	
}
