package mccp;

import java.util.*;

public class jun19_1 {
	public static ArrayList<Integer> negsum(int x,int n,int[] a)
	{
		HashMap<Integer,Integer> h=new HashMap<>();
		ArrayList<Integer> arr=new ArrayList<>();
		int csum=0,c=0;
		for(int i=0;i<n;i++)
		{
			if(x==a[i])
			{
				c++;
			}
			csum=csum+a[i];
			if(csum==0)
			{
				arr.add(0);
				arr.add(i);
				c++;			}
			else if(h.containsKey(csum-x))
			{
				arr.add(h.get(csum-x)+1);
				arr.add(i);
				c++;
			}
			else
			{
				h.put(csum,i);
			}
		}
		System.out.println(c);
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
		System.out.print(negsum(k,n,a));
	}

}
