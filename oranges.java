package mccp;
import java.util.*;

public class oranges {

    public static int minCostToBuyOranges(int cost[], int w) {
        //Your code goes here
        int[] dp=new int[w+1];
        dp[0]=0;
        for(int i=1;i<=w;i++)
        {
            dp[i]=Integer.MAX_VALUE;
        }
        for(int i=1;i<=cost.length;i++)
        {
            if(cost[i-1]==-1)
            {
                continue;
            }
            for(int j=i;j<=w;j++)
            {
                if(dp[j-i]!=Integer.MAX_VALUE)
                {
                    dp[j]=Math.min(dp[j],dp[j-i]+cost[i-1]);
                    System.out.print(dp[j]+" ");
                }
            }
            System.out.println();
        }
        for(int i=0;i<=w;i++)
        {
        	System.out.print(dp[i]+" ");
        }
        System.out.println();
        if(dp[w]==Integer.MAX_VALUE)
        {
            return -1;
        }
        else
        {
            return dp[w];
        }
    }
    public static void main(String[] args)
    {
    	Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
    	int w=sc.nextInt();
    	int[] a=new int[n];
    	for(int i=0;i<n;i++)
    	{
    		a[i]=sc.nextInt();
    	}
    	int x=minCostToBuyOranges(a,w);
    	System.out.print("Answer is:"+x);
    }
}
