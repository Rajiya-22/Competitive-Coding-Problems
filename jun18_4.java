package mccp;

import java.util.*;
import java.util.HashMap;

public class jun18_4 {
	public static int max(int k,int n,int[] a)
	{
		int s=0,m=0;
		int f=0;
		HashMap<Integer,Integer> h=new HashMap<>();
		for(int i=0;i<k;i++)
		{
			if(h.containsKey(a[i]))
			{
				h.put(a[i], h.get(a[i])+1);
			}
			else
			{
				h.put(a[i], 1);
			}
			s=s+a[i];
		}
		if(h.size()==k)
		{
			m=s;
		}
		for(int i=k;i<n;i++)
		{
			h.put(a[i-k],h.get(a[i-k])-1);
			if(h.get(a[i-k])==0)
			{
				h.remove(a[i-k]);
			}
			if(h.containsKey(a[i]))
			{
				h.put(a[i],h.get(a[i])+1);
			}
			else
			{
				h.put(a[i], 1);
			}
			if(h.size()==k)
			{
				f=m-a[i-k]+a[i];
			}
			m=Math.max(m, f);
		}
		return m;
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
		System.out.print(max(k,n,a));
		
	}

}
