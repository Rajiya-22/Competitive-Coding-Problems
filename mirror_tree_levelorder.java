package mccp;

import java.util.*;

public class mirror_tree_levelorder {
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
		Queue<Node> q=new LinkedList<>();
		q.add(root);
		while(!q.isEmpty())
		{
			Node temp=q.poll();
			if(temp.left!=null && temp.right!=null)
			{
				Node t=temp.left;
				temp.left=temp.right;
				temp.right=t;
			}
			if(temp.left!=null)
			{
				q.add(temp.left);
			}
			if(temp.right!=null)
			{
				q.add(temp.right);
			}
		}
	}
	
	static void traversal(Node root)
	{
		if(root!=null)
		{
			traversal(root.left);
			System.out.print(root.data+" ");
			traversal(root.right);
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
		traversal(root);
		System.out.println();
		mirror(root);
		traversal(root);
	}
}
