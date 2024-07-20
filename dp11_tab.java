package mccp;

import java.util.Scanner;

public class dp11_tab {
	public static int kadane(int[] a,int n)
	{
		int max=a[0],cmax=a[0];
		for(int i=1;i<n;i++)
		{
			cmax=Math.max(a[i],a[i]+cmax);
			if(max<cmax)
			{
				max=cmax;
			}
		}
		return max;
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
		System.out.print(kadane(a,n));
	}

}
