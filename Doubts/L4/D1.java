import java.util.Scanner;

public class D1{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int m= sc.nextInt();

		NormalClass obj=new NormalClass();
		System.out.println(obj.addfx(n,m));
	}
}

class NormalClass{
	
	public int addfx(int n,int m){
		int a=n+m;
		return a;

	}
}