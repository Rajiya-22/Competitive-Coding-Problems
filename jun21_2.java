package mccp;
import java.util.*;
public class jun21_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] dp=new int[n+1];
		dp[2]=1;
		for(int i=4;i<=n;i++)
		{
			if(i%2==0)
			{
				dp[i]=2*dp[i-2];
			}
		}
		System.out.print(dp[n]);
	}

}
