package mccp;

import java.util.*;

public class dp10_tab {
	public static int edit(String s1,String s2)
	{
		int m=s1.length(),n=s2.length();
		int[][] t=new int[m+1][n+1];
		for(int i=0;i<=n;i++)
		{
			t[0][i]=i;
		}
		for(int i=0;i<=m;i++)
		{
			t[i][0]=i;
		}
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(s1.charAt(i-1)==s2.charAt(j-1))
				{
					t[i][j]=t[i-1][j-1];
				}
				else
				{
					t[i][j]=1+Math.min(t[i-1][j-1],Math.min(t[i-1][j], t[i][j-1]));
				}
			}
		}
		return t[m][n];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String s1=sc.next();
String s2=sc.next();
System.out.print(edit(s1,s2));
	}

}
