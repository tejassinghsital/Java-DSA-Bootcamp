package com.tejas;
import java.util.Scanner;

public class P7TypeCasting{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int a='a';// char not compatible hence converted automatically without type casting
		int f=(int)(7872073.7345);// compatible hence double gets converted to int with some data loss(narrowing)
		float s=(float) (7878623.7673);//// compatible hence double gets converted to float with some data loss(narrowing)
		System.out.println(a);
		System.out.println(f);
		System.out.println(s);
	}
}