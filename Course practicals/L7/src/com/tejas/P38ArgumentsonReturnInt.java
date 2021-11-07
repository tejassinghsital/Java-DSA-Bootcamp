package com.tejas;

import java.util.Scanner;

public class P38ArgumentsonReturnInt{

	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st number: ");
		int n1=sc.nextInt();
		System.out.print("Enter 2nd number: ");
		int n2=sc.nextInt();
		int ans=sum(n1,n2);
		System.out.println(ans);


	}

	static int sum(int num1, int num2){
		int sum=num1+num2;
		return sum;

	}

}