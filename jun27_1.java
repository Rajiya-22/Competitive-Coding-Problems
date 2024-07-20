package mccp;

import java.util.*;

public class jun27_1 {
	public static int find(int m,int n,int[][] a)
	{
		int[][] dp=new int[m][n];
		dp[0][0]=a[0][0];
		for(int i=1;i<m;i++)
		{
			dp[i][0]=a[i][0];
		}
		for(int i=1;i<n;i++)
		{
			dp[0][i]=a[0][i];
		}
		int max=0;
		for(int i=1;i<m;i++)
		{
			for(int j=1;j<n;j++)
			{
				if(a[i][j]==1)
				{
					dp[i][j]=Math.min(dp[i-1][j], Math.min(dp[i][j-1], dp[i-1][j-1]))+1;
					max=Math.max(dp[i][j], max);
				}
				else
				{
					dp[i][j]=0;
				}
			}
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[][] a=new int[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.print(find(m,n,a));
	}

}
