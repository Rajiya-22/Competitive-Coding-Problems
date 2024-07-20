package mccp;

import java.util.ArrayList;
import java.util.Scanner;

public class jun20_2 {
	public static ArrayList<Integer> print(int n,int k,int[] a)
	{
		ArrayList<Integer> arr=new ArrayList<>();
		for(int i=0;i<n+k-1;i++)
		{
			int c=0;
			for(int j=0;j<i+k;j++)
			{
				if(a[j]<0)
				{
					arr.add(a[j]);
				}
				else
				{
					c++;
				}
			}
			if(c==k)
			{
				arr.add(0);
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			 a[i]=sc.nextInt();
		}
		ArrayList<Integer> x=print(n,k,a);
		for(Integer i:x)
		{
			System.out.println(i);
		}
	}

}
