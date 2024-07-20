package mccp;
import java.util.*;
public class jun21_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] dp=new int[n+1];dp[0]=1;
		if(n>0)
		{
			dp[1]=1;
		}
		for(int k=2;k<=n;k++)
		{
			for(int i=0;i<k;i++)
			{
				dp[k]=dp[k]+(dp[i]*dp[k-i-1]);
			}
		}
		for(int i:dp)
		{
			System.out.print(i+" ");
		}
	}

}
