package com.tejas;
import java.util.Scanner;

public class P43MethodScope{
	public static void main(String[] args)
	{


		//Sytsem.out.println(num2);// this gives error because num2 is defined in random method and can't be accessed here in main method without initiliazation like int num2=43; and this one is different from the one we created in random method.
	}

	static void random(int num){
		int num2=43;
		num2=65;
		num=43;
		num=45+76;// this num and num2 is only accessed and manuplulated within the scope of this method only
	}

}