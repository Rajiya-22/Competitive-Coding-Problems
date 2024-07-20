package mccp;

import java.util.Scanner;

public class jun20_3 {
//	public static int palindrome(char[] a,int l,int h)
//	{
//		if(l>h)
//		{
//			return Integer.MAX_VALUE;
//		}
//		if(l==h)
//		{
//			return 0;
//		}
//		if(l==h-1)
//		{
//			return 1;
//		}
//		else if(a[l]==a[h])
//		{
//			return palindrome(a,l+1,h-1);
//		}
//		else
//		{
//			return Math.min(palindrome(a,l+1,h), palindrome(a,l,h-1))+1;
//		}
//	}
	public static int palindrome(String s)
	{
		int[][] dp=new int[s.length()][s.length()];
		int n=s.length();
		for(int i=1;i<n;i++)
		{
			for(int l=0,h=i;h<n;l++,h++)
			{
				if(s.charAt(l)!=s.charAt(h))
				{
					dp[l][h]=Math.min(dp[l+1][h], dp[l][h-1])+1;
				}
				else
				{
					dp[l][h]=dp[l+1][h-1];
				}
			}
		}
		return dp[0][n-1];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
//		System.out.print(palindrome(s.toCharArray(),0,s.length()-1));
		System.out.print(palindrome(s));
	}

}
