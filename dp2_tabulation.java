package mccp;

import java.util.*;

public class dp2_tabulation {
	public static int stairs(int n)
	{
		int[] dp=new int[n+1];
		dp[0]=0;
		dp[1]=1;
		dp[2]=2;
		for(int i=3;i<=n;i++)
		{
			dp[i]=dp[i-1]+dp[i-2];
		}
		return dp[n];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print(stairs(n));
	}

}
