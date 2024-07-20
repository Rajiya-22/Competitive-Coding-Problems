package mccp;

import java.util.*;

public class dp1_memorization {
	public static int fibo(int n)
	{
		if(n==0)
		{
			return 0;
		}
		else if(n==1)
		{
			return 1;
		}
		else
		{
			return fibo(n-1)+fibo(n-2);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print(fibo(n));
	}

}
