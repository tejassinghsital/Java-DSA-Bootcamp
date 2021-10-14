package com.tejas;
import java.util.Scanner;

public class P28NestedSwitchSS{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int empno= sc.nextInt();
		String empdept=sc.next();

		switch(empno){

			case 1:
				System.out.println("Tejas Singh");
				break;

			case 2:
				System.out.println("Kunal Kushwaha");
				break;
			case 3:
				System.out.println("Employee 3");
				{
					switch(empdept){
						case "IT": 
							System.out.println("IT");
							break;

						case "Management": 
							System.out.println("Management");
							break;

						default:
							System.out.println("No department entered");

					}
				}
			
				break;
			default:
				System.out.println("Please enter valid week day.");
		}
	}
}