package mccp;

import java.util.*;

public class dp8_tabulation {
	public static int allpaths(int m,int n)
	{
		int[][] dp=new int[m+1][n+1];
		for(int i=0;i<=m;i++)
		{
			dp[i][0]=1;
		}
		for(int i=0;i<=n;i++)
		{
			dp[0][i]=1;
		}
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=n;j++)
			{
				dp[i][j]=dp[i-1][j]+dp[i][j-1];
			}
		}
		return dp[m-1][n-1];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=sc.nextInt();
System.out.print(allpaths(m,n));
	}

}
