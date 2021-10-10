package com.tejas;

public class Trial
{
	public static void main(String[] args)
	{

		byte b=50;
		int c=b*2;
		System.out.println(((Object)c).getClass().getSimpleName());

		int[] arr= new int[5];
		System.out.println(arr.getClass().getSimpleName());
	}
}