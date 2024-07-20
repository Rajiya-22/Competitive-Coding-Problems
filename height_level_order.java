package mccp;

import java.util.*;

public class height_level_order {
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
	public static void height(Node root)
	{
		if(root==null)
		{
			return ;
		}
		int h=0;
		Queue<Node> q=new LinkedList<>();
		q.add(root);
		q.add(null);
		while(!q.isEmpty())
		{
			root=q.poll();
			if(root==null)
			{
				h++;
				if(!q.isEmpty())
				{
					q.add(null);
				}
			}
			else
			{
			if(root.right!=null)
			{
				q.add(root.right);
			}
			if(root.left!=null)
			{
				q.add(root.left);
			}
			}
		}
		System.out.print(h);
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
		height(root);
	}
}
