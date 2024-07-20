package mccp;
import java.util.*;
public class day3_1 {
	public static void p1(int[] a,int n) {
		ArrayList<Integer> a1=new ArrayList<>();
		ArrayList<Integer> a2=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			if(i%2==0)
			{
				a1.add(a[i]);
			}
			else
			{
				a2.add(a[i]);
			}
		}
		a2.addAll(a1);
		for(int i=0;i<n;i++)
		{
			System.out.print(a2.get(i)+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		p1(a,n);
	}

}
