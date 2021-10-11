package com.tejas;
import java.util.Scanner;

public class P14ForLoop{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		for(int n=1;n<=num;n++){// when we know how many times a loop going to run then we use for loop otherwise while/do-while loop.
			System.out.println(n);
		}
	}
}