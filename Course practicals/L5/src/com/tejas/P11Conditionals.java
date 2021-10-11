package com.tejas;
public class P11Conditionals{
	public static void main(String[] args)
	{
		int salary=25400;
		if(salary>10000){
			salary+=2000;//short hand operator meaning salary=salary+2000;
		}
		else if(salary>20000)
		{
			salary+=3000;
		}
		else{
			salary+=1000;
		}
		System.out.println(salary);
	}
}