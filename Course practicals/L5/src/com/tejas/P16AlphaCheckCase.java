package com.tejas;
import java.util.Scanner;
import java.lang.Math;

public class P16AlphaCheckCase{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an Alphabet(Upper or lower case): ");
		// there is nothing called nextChar() that's why we take a string input with next() and trim it for only 1st letter.
		char ch=sc.next().trim().charAt(0);/*trim removes extra spaces from start of input string(if any) and charAt(0) basically 
		means that take character at 0th index of inputed string.
		ex: System.out.println(in.next().trim().charAt(0));
		i/p:     Tejas
			Tejas // Trim removed starting extra spaces from inputed string
			T  // Tejas was string so we use charAt(0) to convert it's first letter to character with 0th index.*/


		if(ch>='a' && ch<='z')//&& meanse both condition should satisfy/true
		{
			System.out.println(ch+" is lower case.");
		}
		else
		{
			System.out.println(ch+" is Upper case.");
		}
	}
}