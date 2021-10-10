package com.tejas;

public class P8TypePromotion{
	public static void main(String[] args)
	{
		byte w=40;
		byte x=50;
		byte y=100;
		int z=w*x/y;/* w*x is 2000 and it converted automatically into int because of type prmotion 1st rule 
		that's why z should be int to store int type values get from w*x. ANd if it's byte then we get an error.*/
		System.out.println(z);

		//byte b=x*2;// this gives error cos x*2 is int(converted from byte to int as 1st rule of type promotion) and int can't be stored in byte datatype.


		int no='A';
		System.out.println(no);//char also promoted to int automatically cos of 1st rule of type promotion.

		int l=3;
		float m=5.6f;
		System.out.println(l*m);// the answer in float cos of 2nd rule of type promotion.

		int c=257;
		byte d=(byte)(c);//257%256=1 cos of 3rd rule of type promotion.
		System.out.println(d);

	}
}