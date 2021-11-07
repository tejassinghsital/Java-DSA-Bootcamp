package com.tejas;
import java.util.Scanner;

public class P44BlockScope{
	public static void main(String[] args)
	{
		int n=5;


		 for(int i=1;i<=n;i++){

		 	int a=10;
		 	int bc=45; // these all reamins inside the scope of  for loop and cannot be accessed outside.We can create same variables outside after this loop.
		 	//int i=7;// this gives error cos it already initialised in main
		 	n=9;// we can only update n within loop
		 }

		 System.out.println(i); // this gives error cos i is initialised in loop and cannot be accessed outside of loop.
		 
	}

}