package mccp;

import java.util.Scanner;

public class ncrrecur {
	public static int val(int n,int r)
	{
		if(n==r)
		{
			return 1;
		}
		if(r==0)
		{
			return 1;
		}
		return val(n-1,r-1)+val(n-1,r);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r=sc.nextInt();
		System.out.print(val(n,r));
	}

}
