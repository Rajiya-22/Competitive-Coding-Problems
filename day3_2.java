package mccp;

import java.util.*;

public class day3_2 {
	public static void p1(int[] a,int n) {
		int e=0,o=0;
		for(int i=0;i<n;i++)
		{
			if((i+1)%2==0)
			{
				if(a[i]%2==0)
				{
					e=e+a[i];
				}
			}
			else
			{
				if(a[i]%2!=0)
				{
					o=o+a[i];
				}
			}
		}
			System.out.print(Math.abs(e-o));
		
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
		p1(a,n);
	}

}
