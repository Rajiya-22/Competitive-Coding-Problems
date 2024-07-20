package mccp;

import java.util.Scanner;

public class ncr {
	public static void val(int n,int r)
	{
		int dp[]=new int[r+1];
		dp[0]=1;
		for(int i=1;i<=r;i++)
		{
			dp[i]=0;
		}
		for(int i=1;i<=n;i++)
		{
			for(int j=Math.min(r, i);j>=1;j--)
			{
				dp[j]=dp[j]+dp[j-1];
			}
		}
		for(int i=0;i<=r;i++)
		{
			System.out.print(dp[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r=sc.nextInt();
		val(n,r);
	}

}
