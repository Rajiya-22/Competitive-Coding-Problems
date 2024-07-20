package mccp;

import java.util.Scanner;

public class dp11_recursion {
	public static int kadane(int[] a,int n,int max,int cmax)
	{
		if(n==1)
		{
			return max;
		}
			return kadane(a,n-1,Math.max(max,cmax),Math.max(a[n-1],a[n-1]+cmax));
		
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
		int max=a[0],cmax=a[0];
		System.out.print(kadane(a,n,max,cmax));
	}

}
