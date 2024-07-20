package mccp;

public class dp7_memorization {
	public static int coins()
	{
		for(int i=1;i<=v;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(a[j]<=i)
				{
					dp[i]=Math.min(dp[i],1+dp[i-a[j]]);
				}
			}
		}
		if(dp[n]==Integer.MAX_VALUE)
		{
			return -1;
		}
		else
		{
			return dp[v];
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
