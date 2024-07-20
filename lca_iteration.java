package mccp;

import java.util.*;

public class lca_iteration {
	public static class Node
	{
		int data;
		Node(int d)
		{
			data=d;
		}
		Node left,right;
	}
	static Node root=null;
	static ArrayList<Integer> arr(Node root,int n)
	{
		ArrayList<Integer> a=new ArrayList<>();
		while(root!=null)
		{
			a.add(root.data);
			if(root.data==n)
			{
				return a;
			}
			if(root.data>n)
			{
				root=root.left;
			}
			else if(root.data<n)
			{
				root=root.right;
			}
		}
		return a;
	}
	public static int lca(Node root,int n1,int n2)
	{
		ArrayList<Integer> a1=arr(root,n1);
		ArrayList<Integer> a2=arr(root,n2);
		
		if(a1.size()<a2.size())
		{
		for(int i=1;i<a1.size();i++)
		{
			for(int j=1;j<a2.size();j++)
			{
				if(a1.get(i)==a2.get(j))
				{
					return a1.get(i);
				}
			}
		}
		}
		else
		{
			for(int i=1;i<a2.size();i++)
			{
				for(int j=1;j<a1.size();j++)
				{
					if(a2.get(i)==a1.get(j))
					{
						return a1.get(j);
					}
				}
			}
		}
		return root.data;
	}
	private static Node insert(Node root,int key)
	{
		Node curr=root;
		Node parent=null;
		Node t=new Node(key);
		if(root==null)
		{
			return t;
		}
		else
		{
			while(curr!=null)
			{
				parent=curr;
				if(key<curr.data)
				{
					curr=curr.left;
				}
				else
				{
					curr=curr.right;
				}
			}
		}
		if(parent.data>key)
		{
			parent.left=t;
		}
		else if(parent.data<key)
		{
			parent.right=t;
		}
		return root;
	}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	System.out.print("elements:");
	for(int i=0;i<n;i++)
	{
		root=insert(root,sc.nextInt());
	}
	int n1=sc.nextInt();
	int n2=sc.nextInt();
	System.out.print(lca(root,n1,n2));
		}
}
