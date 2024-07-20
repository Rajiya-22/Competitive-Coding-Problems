package mccp;

import java.util.*;

public class dp6_tabulation {
	public static void lcs(String s1,String s2)
	{
		char[] x=s1.toCharArray();
		char[] y=s2.toCharArray();
		int m=s1.length();
		int n=s2.length();
		int[][]  dp=new int[m+1][n+1];
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(x[i-1]==y[j-1])
				{
					dp[i][j]=dp[i-1][j-1]+1;
				}
				else
				{
					dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
				}
			}
		}
		String res="";
		int i=m,j=n;
		while(i>0 && j>0)
		{
			if(x[i-1]==y[j-1])
			{
				res=x[i-1]+res;
				i--;j--;
			}
			else if (dp[i-1][j]>dp[i][j-1])
			{
				i--;
			}
			else
			{
				j--;
			}
		}
		System.out.print(res);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		lcs(s1,s2);
	}

}
