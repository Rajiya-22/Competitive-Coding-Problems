package mccp;

import java.util.*;

public class DSU_2_detectcycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			int v=sc.nextInt();
			List<List<Integer>> e1=new ArrayList<>();
			for(int i=0;i<v;i++)
			{
				e1.add(new ArrayList<Integer>());
			}
			int E=sc.nextInt();
			for(int i=0;i<E;i++)
			{
				int u=sc.nextInt();
				int v1=sc.nextInt();
				e1.get(u).add(v1);
			}
			boolean ans=isCycle(v,e1);
			if(ans)
			{
				System.out.print("cylce");
			}
			else
			{
				System.out.print("no");
			}
	}

	private static boolean isCycle(int v, List<List<Integer>> e1) {
		// TODO Auto-generated method stub
		boolean visited[] =new boolean[v];
		boolean path[]=new boolean[v];
		for(int i=0;i<v;i++)
		{
			if(visited[i]==false)
			{
				boolean ans=dfs(i,e1,visited,path);
				if(!ans)
				{
					return true;
				}
			}
		}
		return false;
	}

	private static boolean dfs(int start, List<List<Integer>> e1, boolean[] visited, boolean[] path) {
		// TODO Auto-generated method stub
		visited[start]=true;
		path[start]=true;
		for(Integer x:e1.get(start))
		{
			if(visited[x]==false)
			{
				boolean ans=dfs(x,e1,visited,path);
				if(ans!=true)
				{
					return true;
				}
			}
			else if(path[x]=true)
			{
				return true;
			}
			path[x]=false;
		}
		return false;
	}

}
