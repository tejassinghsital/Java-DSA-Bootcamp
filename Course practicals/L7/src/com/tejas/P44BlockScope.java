package com.tejas;
import java.util.Scanner;

public class P44BlockScope{
	public static void main(String[] args)
	{
		int mainvar=33;
		{// simply created a block

			int blockvar=45;// this has it's scope within block only means we can create variable with same name in main too
			System.out.println("This blockvar is created block"+blockvar);

			//int mainvar=35;// this gives error cos it's already initialized in main so it can't initialized here.
			mainvar=95; // it only can be updatred like this...
		}

		int blockvar=34;
		System.out.println("This blockvar is created in main after once created in block"+blockvar);

	}

}