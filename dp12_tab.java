package mccp;

import java.util.*;

public class dp12_tab {
	public static int knapsack(int[] val,int[] wt,int w,int n)
	{
		int[][] k=new int[n+1][w+1];
		for(int i=0;i<=w;i++)
		{
			k[0][i]=0;
		}
		for(int i=0;i<=n;i++)
		{
			k[i][0]=0;
		}
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=w;j++)
			{
				if(wt[i-1]<=j)
				{
					k[i][j]=Math.max(k[i-1][j-wt[i-1]]+val[i-1],k[i-1][j]);
				}
				else
				{
					k[i][j]=k[i-1][j];
				}
			}
		}
		return k[n][w];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] wt=new int[n];
		int[] val=new int[n]; 
		for(int i=0;i<n;i++)
		{
			wt[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			val[i]=sc.nextInt();
		}
		int w=sc.nextInt();
		System.out.print(knapsack(val,wt,w,n));
	}

}
