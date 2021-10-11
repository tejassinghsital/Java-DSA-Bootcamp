package com.tejas;
import java.util.Scanner;

public class P12WhileLoop{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int n=1;

		while(n<=num)// we use while loop when we don't know how many time this looop going to run like take i/p from user untill he presses x.
		{
			System.out.println(n);
			n++;
		}
	}
}