package mccp;

import java.util.*;

public class dp6_memorization {
	public static int lcs(String s1,String s2,int m,int n)
	{
		if(m==0||n==0)
		{
			return 0;
		}
		else if(s1.charAt(m-1)==s2.charAt(n-1))
		{
			return lcs(s1,s2,m-1,n-1)+1;
		}
		else
		{
			return Math.max(lcs(s1,s2,m-1,n), lcs(s1,s2,m,n-1));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		int m=s1.length();
		int n=s2.length();
		System.out.print(lcs(s1,s2,m,n));
	}

}
