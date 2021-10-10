package com.tejas;

public class P10TypeChecking
{
	public static void main(String[] args)
	{

		byte b=50;
		int c=b*2;
		System.out.println(((Object)c).getClass().getSimpleName());////for type checking of integer primitive datatype

		int[] arr= new int[5];
		System.out.println(arr.getClass().getSimpleName());//for type checking of array non primitive datatype

		String s="Tejas Singh";
		System.out.println(s.getClass().getSImpleName());//for type checking of string non primitive datatype
	}
}