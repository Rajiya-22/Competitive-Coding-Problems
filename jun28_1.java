package mccp;

import java.util.Scanner;

public class jun28_1 {
	public static boolean isSubset(int[] a,int n,int s)
	{
		boolean[][] dp=new boolean[n+1][s+1];
		for(int i=0;i<n;i++)
		{
			dp[i][0]=true;
		}
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=s;j++)
			{
				if(j>=a[i-1])
				{
					dp[i][j]=dp[i-1][j]||dp[i][j-a[i-1]];
				}
				else
				{
					dp[i][j]=dp[i-1][j];
				}
			}
		}
		return dp[n][s];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print(isSubset(a,n,s));
	}

}
