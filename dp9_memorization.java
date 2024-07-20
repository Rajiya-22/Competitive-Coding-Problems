package mccp;

import java.util.*;

public class dp9_memorization {
	public static int allpaths(int m,int n,int[][] c)
	{
		if(m==0 || n==0)
		{
			return 0;
		}
		if()
		{
			
		}
		else
		{
		return Math.min(allpaths(m-1,n,c), Math.min(allpaths(m-1, n-1,c),allpaths(m, n-1,c)))+c[];
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[][] c=new int[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				c[i][j]=sc.nextInt();
			}
		}
		System.out.print(allpaths(m,n,c));
	}

}
