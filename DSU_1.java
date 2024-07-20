package mccp;
import java.util.*;
public class DSU_1 {
	static int[] parent;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int n1=sc.nextInt();
		int k=sc.nextInt();
		parent=new int[n];
		for(int i=0;i<n;i++)
		{
			parent[i]=i;
		}
		for(int i=0;i<n1;i++)
		{
			int x=sc.nextInt();
			int y=sc.nextInt();
			union(x,y);
		}
		for(int i=0;i<k;i++)
		{
			int x=sc.nextInt();
			int y=sc.nextInt();
			if(find(x)==find(y))
			{
				System.out.println("friend");
			}
			else
			{
				System.out.print("not friends");
			}
		}
	}

	private static void union(int x, int y) {
		// TODO Auto-generated method stub
		int rx=find(x);
		int ry=find(y);
		parent[ry]=rx;
	}

	private static int find(int y) {
		// TODO Auto-generated method stub
		if(parent[y]==y)
			return y;
		return find(parent[y]);
	}

}
