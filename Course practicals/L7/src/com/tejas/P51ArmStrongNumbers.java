// PRINT whether a number is armstrong or not
package com.tejas;
import java.util.Scanner;


public class P51ArmStrongNumbers{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter a number: ");
		int n=sc.nextInt();

		boolean ans=armsts(n);
		System.out.println(ans);


		for(int i=100;i<1000;i++)// this for loop prints all 3 digits armstrongs number within 100 to 1000 using same function that we created for armstrong checking.
		{
			if(armsts(i))
			{
				System.out.print(i+" ");
			}
		}
	}

	static boolean armsts(int n){
		int temp=n;
		int s=0;
		while(n>0)
		{
			
			int r=n%10;
			n=n/10;
			
			s=s+r*r*r;
		}

		if(s==temp)
		{
			return true;
		}
		else{
			return false;	
		}
	}
}