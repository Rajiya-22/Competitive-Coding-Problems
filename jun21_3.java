package mccp;
import java.util.*;
public class jun21_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] dp=new int[n+1];
		dp[0]=0;dp[1]=1;
		for(int i=2;i<=n;i++)
		{
			int min=Integer.MAX_VALUE;
			for(int j=1;j<=Math.floor(Math.sqrt(i));j++)
			{
				if(dp[i-(j*j)]<min)
				{
					min=dp[i-(j*j)];
				}
			}
			dp[i]=min+1;
		}
		System.out.print(dp[n]);
	}

}
