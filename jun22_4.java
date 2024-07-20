package mccp;

import java.util.*;

public class jun22_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int[] dp=new int[n];
		int lp=0,ln=0;dp[0]=1;
		for(int i=1;i<n;i++)
		{
			if((a[i]-a[i-1])>0)
			{
				lp=i;
				dp[i]=1+dp[ln];
			}
			if((a[i]-a[i-1])<0)
			{
				ln=i;
				dp[i]=1+dp[lp];
			}
			else
            {
                dp[i]=Math.max(dp[ln],dp[lp]);
            }
		}
		System.out.print(dp[n-1]);
	}

}
