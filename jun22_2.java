package mccp;
import java.util.*;
public class jun22_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int[] dp=new int[n];dp[0]=a[0];dp[1]=a[1];
		for(int i=2;i<n;i++)
		{
			dp[i]=Math.min(dp[i-1], dp[i-2])+a[i];
		}
		System.out.print(Math.min(dp[n-1],dp[n-2]));
	}

}
