package mccp;
import java.util.*;
public class bst_smallest_element {
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
public static void smallest(Node root)
{
	Node p=root;
	while(p.left!=null)
	{
		p=p.left;
	}
	System.out.println(p.data);
}
public static void largest(Node root)
{
	Node p=root;
	while(p.right!=null)
	{
		p=p.right;
	}
	System.out.print(p.data);
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
smallest(root);
largest(root);
	}

}
