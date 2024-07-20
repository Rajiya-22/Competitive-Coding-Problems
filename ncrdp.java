package mccp;

import java.util.Scanner;

public class ncrdp {
	public static int val(int n,int r)
	{
		int dp[][]=new int[n+1][r+1];
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=r;j++)
			{
				if(j==0)
				{
					dp[i][j]=1;
				}
				if(i==j)
				{
					dp[i][j]=1;
				}
			}
		}
		for(int i=1;i<=n;i++)
		{
			for(int j=Math.min(r, i);j>=1;j--)
			{
				if(dp[i][j]==0)
				{
					dp[i][j]=dp[i-1][j]+dp[i-1][j-1];
				}
			}
		}
//		for(int i=0;i<=n;i++)
//		{
//			for(int j=0;j<=r;j++)
//			{
//				System.out.print(dp[i][j]+" ");
//			}
//			System.out.println();
//		}
		return dp[n][r];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r=sc.nextInt();
		System.out.print(val(n,r));
	}

}
