package mccp;

import java.util.*;

public class dp5_robbery {
public static int robbery(int[] a,int n)
{
	int[] dp=new int[n+1];
	dp[0]=0;
	dp[1]=Math.max(dp[0], a[0]);
	for(int i=2;i<=n;i++)
	{
		dp[i]=Math.max(dp[i-1], dp[i-2]+a[i-1]);
	}
	return dp[n];
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
		System.out.print(robbery(a,n));
	}

}
