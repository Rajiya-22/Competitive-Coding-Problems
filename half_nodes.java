package mccp;

import java.util.*;

public class half_nodes {
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
	public static Node remove(Node root)
	{
		if(root==null)
		{
			return root;
		}
		root.left=remove(root.left);
		root.right=remove(root.right);
		if(root.left==null && root.right==null)
		{
			return root;
		}
		if(root.left==null && root.right != null)
		{
			Node new_root = root.right;
            return new_root;
		}
		if(root.right==null && root.left != null)
		{
			Node new_root = root.left;
            return new_root;
		}
		return root;
	}
	public static void traversal(Node root)
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
		root=insert(root,6);
		root=insert(root,12);
		root=insert(root,11);
		root=insert(root,46);
		root=insert(root,30);
		root=insert(root,38);
		root=insert(root,50);
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		for(int i=0;i<n;i++)
//		{
//			root=insert(root,sc.nextInt());
//		}
		traversal(root);
		System.out.println();
		root=remove(root);
		traversal(root);
	}

}
