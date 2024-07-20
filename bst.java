package mccp;
import java.util.*;
public class bst {
	public static class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
			left=null;
			right=null;
		}
	}
	public static Node root=null;
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
	private static int minNode(Node root)
	{
		int minValue = root.data;
	    while (root.left != null) {
	        minValue = root.left.data;
	        root = root.left;
	    }
	    return minValue;
	}
	private static Node delete(Node root,int key)
	{
		Node p=root;
		if(root==null)
		{
			return root;
		}
		if(p.data<key)
		{
			p.right=delete(p.right, key);
		}
		else if(p.data>key)
		{
			p.left=delete(p.left,key);
		}
		else
		{
			if(p.left==null && p.right==null)
			{
				return null;
			}
			else if(p.left==null)
			{
				Node t=p.right;
				p=t;
				p.right=null;
			}
			else if(p.right==null)
			{
				Node t=p.left;
				p=t;
				p.left=null;
			}
			else
			{
				p.data = minNode(p.right);
				
				p.right=delete(root.right,p.data);
			}
		}
		return root;
	}
	public static void inorder(Node root)
	{
		if(root!=null)
		{
			inorder(root.left);
			System.out.print(root.data+" ");
			inorder(root.right);
		}
		
	}
	public static void preorder(Node root)
	{
		if(root!=null)
		{
			System.out.print(root.data+" ");
			preorder(root.left);
			preorder(root.right);
		}
	}
	public static void postorder(Node root)
	{
		if(root!=null)
		{
			postorder(root.left);
			postorder(root.right);
			System.out.print(root.data+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
//		System.out.println("1.insert\n2.delete\n3.traverse\n4.exit");
		int ch;
		do
		{
			System.out.println("1.insert\n2.delete\n3.traverse\n4.exit");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:System.out.println("enter ele to insert");
				   int ele=sc.nextInt();
				   root=insert(root,ele);
				   break;
			case 2:System.out.print("enter ele to delete");
				   int x=sc.nextInt();
				   root=delete(root,x);
				   break;
			case 3:System.out.println("choose traversal\n 1.inorder\n2.preorder\n3.postorder");
				   int c=sc.nextInt();
				   switch(c)
				   {
				   case 1: inorder(root);
				   System.out.println();
				   		   break;
				   case 2: preorder(root);
				   System.out.println();
				   		   break;
				   case 3: postorder(root);
				   System.out.println();
				   		   break;
				   }
				   break;
			case 4: break;
			}
			
		}while(ch!=4);
		System.out.print("out of loop");
	}

}
