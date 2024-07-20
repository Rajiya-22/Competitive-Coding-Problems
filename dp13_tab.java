package mccp;

import java.util.Scanner;

public class dp13_tab {
	public static int minsteps(int n)
	{
		if(n==0||n==1)
		{
			return 0;
		}
		else if(n==2||n==3)
		{
			return 1;
		}
		int[] dp=new int[n+1];
		dp[0]=0;
		dp[1]=0;
		dp[2]=1;
		dp[3]=1;
		int ans1=0,ans2=0,ans3=0;
		for(int i=4;i<=n;i++)
		{
			ans1=dp[i-1];
			ans2=(i%2==0)?dp[n/2]:Integer.MAX_VALUE;
			ans3=(i%3==0)?dp[n/3]:Integer.MAX_VALUE;
			dp[i]=1+Math.min(ans1, Math.max(ans2, ans3));
		}
		return dp[n];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print(minsteps(n));
	}

}
