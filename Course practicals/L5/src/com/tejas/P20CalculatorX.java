package com.tejas;
import java.util.Scanner;

public class P20CalculatorX{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int ans=0;
		while(true){

			System.out.print("Enter an operator(or press X or x for quit): ");
			char input=sc.next().trim().charAt(0);

			if(input =='+' || input =='-' || input =='/' || input == '*' || input =='%')
			{
				System.out.print("Enter 2 numbers: ");
				int n1= sc.nextInt();
				int n2=sc.nextInt();

				if(input=='+')
				{
					ans=n1+n2;
				}

				if(input=='-')
				{
					ans=n1-n2;
				}

				if(input=='*')
				{
					ans=n1*n2;
				}

				if(input=='/')
				{
					if(n2!=0)
						{
						ans=n1/n2;
						}
				}

				if(input=='%')
				{
					ans=n1%n2;
				}
			}

		else if(input=='x' || input=='X')
		{
			break;
		}

		else{
			System.out.println("Invalid operation!!");
		}

		System.out.println(ans);
		}

	}
}