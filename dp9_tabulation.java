package mccp;

import java.util.*;

public class dp9_tabulation {
	public static int allpaths(int m,int n,int[][] c)
	{
		int[][] dp=new int[m][n];
		dp[0][0]=c[0][0];
		for(int i=1;i<m;i++)
		{
			dp[i][0]=dp[i-1][0]+c[i][0];
		}
		for(int i=1;i<n;i++)
		{
			dp[0][i]=dp[0][i-1]+c[0][i];
		}
		for(int i=1;i<m;i++)
		{
			for(int j=1;j<n;j++)
			{
				dp[i][j]=Math.min(dp[i-1][j],Math.min(dp[i][j-1],dp[i-1][j-1]))+c[i][j];
			}
		}
//		for(int i=0;i<m;i++)
//		{
//			for(int j=0;j<n;j++)
//			{
//				System.out.print(dp[i][j]);
//			}
//			System.out.println();
//		}
		return dp[m-1][n-1];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[][] c=new int[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				c[i][j]=sc.nextInt();
			}
		}
		System.out.print(allpaths(m,n,c));
	}

}
