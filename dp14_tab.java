package mccp;

import java.util.Scanner;

public class dp14_tab {
	public static int LIS(int[] a,int n)
	{
		int[] x=new int[n];
		for(int i=0;i<n;i++)
		{
			x[i]=1;
		}
		for(int i=1;i<n;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(a[i]>a[j])
				{
					if(x[i]<x[j]+1)
					{
						x[i]=x[j]+1;
					}
				}
			}
		}
		return x[n-1];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print(LIS(a,n));
	}

}
