package mccp;

import java.util.*;

public class lca_recursion {
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
	public static int lca(Node root,int n1,int n2)
	{
		if(root.data<n1 && root.data>n2)
		{
			return lca(root.right,n1,n2);
		}
		else if(root.data>n1 && root.data>n2)
		{
			return lca(root.left,n1,n2);
		}
		else
		{
			return root.data;
		}
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
