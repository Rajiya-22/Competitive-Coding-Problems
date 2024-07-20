package mccp;
import java.util.*;
public class jun21_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] dp=new int[n+1];dp[0]=0;dp[1]=1;
		int max=Integer.MIN_VALUE;
		for(int i=2;i<=n;i++)
		{
			if(i%2==0)
			{
				dp[i]=dp[i/2];
			}
			else
			{
				dp[i]=dp[i/2]+dp[(i/2)+1];
			}
			max=dp[i];
		}
		System.out.print(max);
	}

}
