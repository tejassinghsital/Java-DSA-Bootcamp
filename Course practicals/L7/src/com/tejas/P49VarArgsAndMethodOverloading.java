package com.tejas;
import java.util.Arrays;

public class P49VarArgsAndMethodOverloading{
	public static void main(String[] args){

		demo(3,4,5);// here compiler uses demo with int var args parameters.

		demo("Tejas","Singh","Sital");// here compiler uses demo with string var args parameters.
		
		//demo();//although varrgs supports empty parameters but here we get error. it is called ambiguity because now compiler gets confused that which one(string or int) to choose.
	}

	static void demo(int ...v){
		System.out.println(Arrays.toString(v));
	}


	static void demo(String ...v){
		System.out.println(Arrays.toString(v));
	}

}