package mccp;

import java.util.*;

public class jun21_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int N=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int[] dp=new int[N+1];
		dp[0]=1;
		for(int i=1;i<=N;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i>=a[j])
				{
					dp[i]=dp[i]+dp[i-a[j]];
				}
			}
		}
		System.out.print(dp[N]);
	}

}
