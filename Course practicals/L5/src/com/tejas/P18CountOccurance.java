//self made code, if want to see tutorial approach go to Lecture 5 43:20
package com.tejas;
import java.util.Scanner;

public class P18CountOccurance{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		long n=sc.nextLong();

		System.out.println("Which digit you want to check occurance: ");
		int o=sc.nextInt();

		int count=0;

		while(n>0){

		int r=n%10;
		n=n/10;

		if(r==o)
		{
			count++;
		}
	}

		System.out.println("The digit "+ o+"  occur "+ count+" times.");

	}
}