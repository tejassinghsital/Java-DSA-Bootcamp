package com.tejas;

import java.util.Scanner;

public class P37ArgumentsonReturnString{

	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc.nextLine();
		String message=greet(name);
		System.out.println(message);


	}

	public static String greet(String name){
		String greetings="Hello "+name;
		return greetings;

	}

}