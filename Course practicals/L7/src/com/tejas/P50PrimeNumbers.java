package com. tejas;

import java.util.Scanner;

public class P50PrimeNumbers{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a positive number for prime check: ");
		int n=sc.nextInt();

		boolean ans=primecheck(n);
		System.out.println(ans);
	}

	static boolean primecheck(int n){

		if(n<=0 || n==1)
		{
			return false;
		}

		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}

	return true;
	}
}