package mccp;

import java.util.Scanner;
import java.util.Stack;

public class dfs_adjmatrix_iteration {
	static int n;
	static int[][] a;
	static int[] vis;
	public static void dfs(int v)
	{
		Stack<Integer> s=new Stack<>();
		s.push(v);
		while(!s.empty())
		{
			int t=s.peek();
			System.out.print(t+" ");
			s.pop();
			vis[t]=1;
			for(int i=0;i<n;i++)
			{
				if(vis[i]!=1 && a[t][i]==1)
				{
					s.push(i);
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter n:");
		n=sc.nextInt();
		a=new int[n][n];
		vis=new int[n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
//		for(int i=0;i<n;i++)
//		{
//			for(int j=0;j<n;j++)
//			{
//				System.out.print(a[i][j]+" ");
//			}
//			System.out.println();
//		}
		for(int i=0;i<n;i++)
		{
			vis[i]=0;
		}
		System.out.print("enter start vertex");
		int v=sc.nextInt();
		dfs(v);
	}

}
