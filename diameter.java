package mccp;

import java.util.*;

public class diameter {
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
	static void mirror(Node root)
	{
		if(root==null)
		{
			return ;
		}
		mirror(root.left);
		mirror(root.right);
		
		Node t=root.left;
		root.left=root.right;
		root.right=t;
	}
	
	static int height(Node root)
	{
		if(root==null)
		{
			return 0;
		}
		return 1+Math.max(height(root.left),height(root.right));
	}
	static int dia(Node root)
	{
		if(root==null)
		{
			return 0;
		}
		int ldia=dia(root.left);
		int rdia=dia(root.right);
		int lh=height(root.left);
		int rh=height(root.right);
		return Math.max(1+lh+rh,Math.max(rdia, ldia));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		root=insert(root,20);
		root=insert(root,10);
		root=insert(root,6);
		root=insert(root,12);
		root=insert(root,11);
		root=insert(root,46);
		root=insert(root,30);
		root=insert(root,38);
		root=insert(root,50);
		System.out.print(dia(root));
	}
}
