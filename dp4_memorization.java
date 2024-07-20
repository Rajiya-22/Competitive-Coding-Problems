package mccp;

import java.util.*;

public class dp4_memorization {
	public static int stairs(int n,int m)
	{
		int x=0;
		if(n==0)
		{
			return 0;
		}
		else
		{
			for(int i1=1;i1<=m;i1++)
			{
				x= x+ stairs(n-i1,m);
			}
		}
		return x;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		System.out.print(stairs(n,m));
	}

}
