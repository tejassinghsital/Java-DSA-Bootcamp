package com.tejas;
import java.util.Scanner;

public class P6TypeConversion{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		float a=sc.nextFloat();// if we put character value in it at runtime then it shows error because char is not compatible with float.
		System.out.println(a);//Type conversion deal with input at runtime cos if we now at compile time write like float f='a'; then it take it's ASCII value.
	}
}