package mccp;

import java.util.*;

public class jun18_2 {
	public static int max(int k,int n,int[] a)
	{
		int s=0;
		for(int i=0;i<k;i++)
		{
			s=s+a[i];
		}
		int x=0;
		for(int i=k;i<n;i++)
		{
			int f=s-a[x]+a[i];
			x++;
			s=Math.max(s, f);
		}
		for(int i=0;i<k-1;i++)
		{
			int f=s-a[n-k+i]+a[i];
			s=Math.max(s, f);
		}
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			 a[i]=sc.nextInt();
		}
		System.out.print(max(k,n,a));
	}

}
