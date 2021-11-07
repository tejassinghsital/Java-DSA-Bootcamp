package com.tejas;

import java.util.Scanner;

public class P41PassByValueInt{

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter 1st number for swap: ");
		int a= sc.nextInt();
		System.out.print("Enter 2nd number for swap: ");
		int b= sc.nextInt();


		System.out.println(swap(a,b));// this retun swapped values.
		System.out.println(a+" "+b);// this return same value as we provide.

	static int swap(int num1. int num2){
		int temp= num1;
		int num1=num2;
		num2=temp;
		return num1,num2;
	}
}