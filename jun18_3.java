package mccp;

import java.util.*;

public class jun18_3 {
//	public static ArrayList<Integer> max(int k,int n,int[] a)
//	{
//		ArrayList<Integer> arr=new ArrayList<>();
//		HashSet<Integer> h;
//		for(int i=0;i<n-k+1;i++)
//		{
//			h=new HashSet<>();
//			for(int j=i;j<i+k;j++)
//			{
//				h.add(a[j]);
//			}
//			arr.add(h.size());
//		}
//		return arr;
//	}
	public static ArrayList<Integer> max(int k,int n,int[] a)
	{
		ArrayList<Integer> arr=new ArrayList<>();
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
		}
		arr.add(h.size());
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
			arr.add(h.size());
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
		ArrayList<Integer> arr=max(k,n,a);
		for(int i=0;i<arr.size();i++)
		{
			System.out.println(arr.get(i));
		}
	}

}
