package mccp;

import java.util.Scanner;

public class dp4_tabulation {
	public static int stairs(int n,int m)
	{
		int[] dp=new int[n+1];
		dp[0]=0;
		dp[1]=1;
		dp[2]=2;
		for(int i=3;i<=n;i++)
		{
			for(int j=1;j<=m && j<i;j++)
			{
				dp[i]=dp[i]+dp[i-j];
			}
		}
		return dp[n];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		System.out.print(stairs(n,m));
	}

}
