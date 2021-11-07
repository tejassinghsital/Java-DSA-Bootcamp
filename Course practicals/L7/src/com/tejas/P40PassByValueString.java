package com.tejas;

import java.util.Scanner;

public class P40PassByValueString{

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name= sc.nextLine();
		System.out.println(greet(name));//this now holds the value of naam so if you print this then you get Nahi DIkhaunga as output. Because this function take input as vale of name and provid eoutput as value of naam.
		System.out.println(name);// but here is no change because value of name is never been updated in main method. only the value of name is passed to the greet method within naam variable and so naam value is updated and gets returned as greet(name);.
	}

	static String greet(String naam){
		naam= "Nahi Dikhaunga";
		return naam;
	}
}