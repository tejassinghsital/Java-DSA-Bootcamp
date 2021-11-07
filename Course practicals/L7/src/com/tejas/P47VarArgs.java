package com.tejas;
import java.util.Arrays;

public class P47VarArgs{
	public static void main(String[] args){

		method1();// can left it empty
		method1(45,63,45,23,45,67,8,9);

		method2(63,54,"Tejas","Singh","Sital");// we can't miss a and b before starting string values because then it consider string[0] as b and gives error that you can't use string in int type.

	}

	static void method1(int ...nums) 
	{
		System.out.println(Arrays.toString(nums));
	}

	static void method2(int a, int b, String ...english){// we always have to use Varargs at last because it don't know how much values user gona provide
	// we can't do it like static void method2(int a, String ...english, intb); it gives error.
		//System.out.println(Arrays.toString(a,b,english));// this gives error because we can't use a,b, english in same line...(How to use it kushaha ne nahi btaya)
			}

	// we also can't do static void method3(int ...nums, String ... english){
	//System.out.println(Arrays.toString( nums,english));// cos we can only include only one type of Varargs.
//}
}