package com.tejas;

public class P48methodOverloading{
	public static void main(String[] args){

		System.out.println(sum(3,4));
		System.out.println(sum(3,4,5));
		
	}

	static int sum(int a, int b){// return type like void, int etc doesn't matter in method overloading.
		return a+b;
	}


	static int sum(int a, int b, int c){
		return a+b+c;
	}

}