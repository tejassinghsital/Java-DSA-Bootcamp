package com.tejas;
import java.util.Scanner;
import java.lang.Math;

public class P15LargestNumber{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		int n1=sc.nextInt();
		System.out.println("Enter 2nd number: ");
		int n2=sc.nextInt();
		System.out.println("Enter 3rd number: ");
		int n3=sc.nextInt();
		
		int max=n1;
		if(n2>max)
		{
			max=n2;
		}

		if(n3>max)
		{
			max=n3;
		}

		System.out.println(max+" is the maximum value among all 3.");


	//we can also use Math.mx function for this problem like:

		int max2=Math.max(n3,Math.max(n1,n2));

		System.out.println(max2+" is the largest value among all 3 resulted by Math.max function.");

	}
}