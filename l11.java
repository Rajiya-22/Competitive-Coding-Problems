package mccp;

import java.util.*;

public class ll11 {
	public class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			next=null;
		}
	}
	public static Node head=null;
	private Node insert(int ele,Node head) {
		// TODO Auto-generated method stub
		Node temp=new Node(ele);
		Node p=head;
		if(head==null)
			head=temp;
		else {
		while(p.next!=null) {
			p=p.next;
		}
		p.next=temp;
		}
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ll11 l=new ll11();
		System.out.println("enter n");
		int n=sc.nextInt();
		System.out.println("enter elements");
		for(int i=0;i<n;i++) 
			head=l.insert(sc.nextInt(),head);
		reverse(head,n);
	}
	private static void reverse(Node head,int n) {
		// TODO Auto-generated method stub
		Node p1=head;
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=p1.data;
			p1=p1.next;
		}
		p1=head;
		for(int i=n-1;i>=0;i--)
		{
			p1.data=a[i];
			p1=p1.next;
		}
		display(head);
	}
	private static void display(Node head) {
		// TODO Auto-generated method stub
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
}