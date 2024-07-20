package mccp;

import java.util.*;

public class leaf_nodes {
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
	public static void leaf(Node root)
	{
		if(root!=null)
		{
			if(root.left==null && root.right==null)
			{
				System.out.print(root.data+" ");
			}
			leaf(root.left);
			leaf(root.right);
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
		leaf(root);
	}
}
