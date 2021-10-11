package com.tejas;
import java.util.Scanner;

public class P13DoWhileLoop{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int n=1;

		do{
			System.out.println(n);
			n++;
		}while(n<=num);

// differenece between while and do-while loop is that do-while loop run atleast one time even if condition in false.

		int l=5;
		do{
			System.out.println(l);
			l++;
		}while(l>=10);//condition is false as n=5 but this do while loop run one time and print value of n i.e 5 once when even condition is false.
	}
}