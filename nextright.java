package mccp;

import java.util.*;

public class nextright {

	public static class Node
	{
		int data;
		Node left,right;
		Node(int data)
		{
			this.data=data;
			left=null;
			right=null;
		}
	}
	static Node root=null;
	public static Node insert(Node root,int key)
	{
		if(root==null)
		{
			Node t=new Node(key);
			return t;
		}
		else if(root.data<key)
		{
			root.right=insert(root.right,key);
		}
		else if(root.data>key)
		{
			root.left=insert(root.left,key);
		}
		return root;
	}
	static void printNodes(Node root,int s)
	{
		if(root==null)
		{
			return;
		}
		boolean f=false;
		Queue<Node> q=new LinkedList<>();
		q.add(root);
		while(!q.isEmpty())
		{
			int n=q.size();
			for(int i=0;i<n;i++)
			{
				Node t=q.poll();
				if(f)
				{
					System.out.print(t.data+" ");
					f=false;
				}
				if(t.data==s)
				{
					f=true;
				}
				if(t.left!=null)
				{
					q.add(t.left);
				}
				if(t.right!=null)
				{
					q.add(t.right);
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		root=insert(root,20);
		root=insert(root,10);
		root=insert(root,40);
		root=insert(root,5);
		root=insert(root,12);
		root=insert(root,30);
		root=insert(root,60);
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		printNodes(root,s);
//		System.out.print(print(root));
	}

}
