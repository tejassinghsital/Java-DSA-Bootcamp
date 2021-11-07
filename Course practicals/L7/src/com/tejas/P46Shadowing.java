package com.tejas;

public class P46Shadowing{
	static int x=90;//class variable

	public static void main(String[] args){

		System.out.println(x);//print 90 cos class variable has its reach here.
		int x;// class variable x reach over because we declared a variable locally with the same name as class variable x.
		//System.out.println(x);// gives error because we doesn't initialized local variable x yet. See doubtp46.java file old concept.
		x=40;// initialized local variable x
		System.out.println(x);// printed value of locall variable x i.e 40
		fun();// print 90 because although its in scope of local vcariable but drawing its value from scope of class variable.
		System.out.println(fun1());// fun() and System.out.println(fun()); is same
		x=x+10;// checking that it's still within the scope of local variable x na and yes it is...
		System.out.println(x);
	}
	static int fun1(){
		return x;
	}
	static void fun(){
		System.out.println(x);
	}

}