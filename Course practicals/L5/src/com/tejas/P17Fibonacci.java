//self made code, if want to see tutorial approach go to Lecture 5 41:35
package com.tejas;
import java.util.Scanner;

public class P17Fibonacci{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter value of n for which you want value of fibonacci series: ");
		int n=sc.nextInt();

		int a=1,b=1,k=0;

		for(int i=3; i<=n;i++)
		{
			k=a+b;
			a=b;
			b=k;
		}
		System.out.println("for "+ n+"th value, the fibonacci number is: "+ k);

	}
}