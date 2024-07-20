package mccp;

import java.util.*;

public class dfs_adjlist_recursion {
	static int[] vis;
	static HashMap<Integer,ArrayList<Integer>> h;
	public static void dfs(int v)
	{
		vis[v]=1;
		System.out.print(v);
		for(Integer i:h.keySet())
		{
			if(vis[i]!=1 && h.get(v).contains(i))
			{
				dfs(i);
			}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		h=new HashMap<>();
		Scanner sc=new Scanner(System.in);
		System.out.print("enter n:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			h.put(i, new ArrayList<>());
		}
		int x=1;
		while(x==1)
		{
			System.out.print("enter the vertices that has edge u and v between 0 to n-1");
			int u=sc.nextInt();
			int v=sc.nextInt();
			h.get(u).add(v);
			System.out.print("Do you want to add any edges? if yes 1 else 0");
			x=sc.nextInt();
			if(x==0)
			{
				break;
			}
		}
//		for(Integer i:h.keySet())
//		{
//			System.out.print(i+":");
//			for(Integer j:h.get(i))
//			{
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
		vis=new int[n];
		for(int i=0;i<n;i++)
		{
			vis[i]=0;
		}
		System.out.print("enter start node:");
		int v=sc.nextInt();
		dfs(v);
	}
}

