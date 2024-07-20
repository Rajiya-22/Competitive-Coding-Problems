package mccp;

import java.util.*;

public class adjacency_list {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,ArrayList<Integer>> h=new HashMap<>();
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
		for(Integer i:h.keySet())
		{
			System.out.print(i+":");
			for(Integer j:h.get(i))
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
