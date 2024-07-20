package mccp;

import java.util.*;

public class pair_sum_bst {
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
	static ArrayList<Integer> a=new ArrayList<>();
	public static void inorder(Node root)
	{
		if(root!=null)
		{
			inorder(root.left);
			a.add(root.data);
			inorder(root.right);
		}
	}
	public static boolean sum(Node root,int k)
	{
		inorder(root);
		int l=a.get(0);
		int r=a.get(a.size()-1);
		while(l<r)
		{
			int s=l+r;
			if(s==k)
			{
				return true;
			}
			if(s<k)
			{
				l++;
			}
			else
			{
				r--;
			}
		}
		return false;
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
	int k=sc.nextInt();
	System.out.print(sum(root,k));
		}
}
