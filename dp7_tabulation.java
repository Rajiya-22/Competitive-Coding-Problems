package mccp;

import java.util.Scanner;

public class dp7_tabulation {
public static int coins(int[] coins,int M,int V)
{
	int[] dp=new int[V+1];
	  dp[0]=0;
	  for(int i=1;i<=V;i++){
	      dp[i]=V+1;
	      
	  }
	  for(int i=1;i<=V;i++){
	      for(int j=0;j<M;j++){
	          if(coins[j]<=i && dp[i - coins[j]] != V + 1){
	              dp[i]=Math.min(dp[i],1+dp[i-coins[j]]);
	          }
	      }
	   //   System.out.println(dp[i]);
	  }
	  int t=dp[V];
	  if(dp[V]==V+1)
	  t=-1;
	  return t;
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
		int am=sc.nextInt();
		System.out.print(coins(a,n,am));
	}

}
