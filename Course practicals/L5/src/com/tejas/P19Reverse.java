//self made code, if want to see tutorial approach go to Lecture 5 49:23
package com.tejas;
import java.util.Scanner;

public class P19Reverse{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		long n=sc.nextLong();
		long temp=n;

		long r=0,s=0;

		while(n>0)
		{
		r=n%10;
		s=s*10+r;
		n=n/10;
		}

		System.out.print("Reverse of "+temp+" is: "+s);
	}
}