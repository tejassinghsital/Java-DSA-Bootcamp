package com.tejas;

public class DoubtP47{
	public static void main(String[] args){

		varargsmethod(48,39,94,56,"Tejas","Singh","Sital");


	}

	static void varargsmethod(int ...nums, String ...english)// gives error because we can use varargs at last only because we
	// don't know how many number of elelemnts one wants to put in varargs that's why two varargs in a single argument scope doesn't work. 
	{
		System.out.pritnln(Arrays.toString(nums,english));
	}
}