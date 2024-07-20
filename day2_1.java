package mccp;
import java.util.*;
public class day2_1 {
	public static void sample(int[] a,int[] b,int n) {
		int[] r=new int[n];
		Arrays.sort(a);
		Arrays.sort(b);
		for(int i=0;i<n;i++)
		{
			r[i]=a[i]+b[i];
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(r[i]+" ");
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
int[] b=new int[n];
for(int i=0;i<n;i++)
{
	b[i]=sc.nextInt();
}
sample(a,b,n);
}

}
