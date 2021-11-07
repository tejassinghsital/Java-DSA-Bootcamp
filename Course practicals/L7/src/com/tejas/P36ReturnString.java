package com.tejas;

import java.util.Scanner;

public class P36ReturnString{

	public static void main(String[] args){

		String message=greet();
		System.out.println(message);


	}

	public static String greet(){
		Scanner sc=new Scanner(System.in);
		System.out.println("What's your name?");
		String name=sc.next();
		String greetings="Hello "+name;
		return greetings;

	}

}