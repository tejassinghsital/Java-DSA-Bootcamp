package com.tejas;


public class P9TypeProEx{
	public static void main(String[] args)
	{
		byte b=42;
		char c='a';
		short s=1024;
		int i= 50000;
		float f=5.67f;
		double d=0.1234;
		double result=(f*b)+(i*c)-(d*s);//(float*byte=float[cos of 2nd type promotion rule])+(int*char=int[1st rule])-(souble*short=double[2nd rule])
		//float+int-double=double(so result should be in double)
		System.out.println((f*b) + " " + (i/c) + " " + (d*s));
		System.out.println(result);




	}
}