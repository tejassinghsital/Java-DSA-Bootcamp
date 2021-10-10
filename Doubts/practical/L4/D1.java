import java.util.Scanner;

public class D1{

	public int addfx(int n,int m){
		int a=n+m;
		return a;

	}
}

class NormalClass{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int m= sc.nextInt();

		D1 obj=new D1();
		System.out.println(obj.addfx(n,m));
	}
}/* this code doesn't work and for it's working replace methods of 2 classes with one another and make object of NormalCLass instead 
 of Di class. This code is in this way for doubt purposes...  