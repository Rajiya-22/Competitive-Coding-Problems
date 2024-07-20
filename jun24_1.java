package mccp;
import java.util.*;
public class jun24_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int n=sc.nextInt();
		int[][] dp=new int[n+1][n+1];
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i!=j)
				{
					if(s.charAt(i)==s.charAt(j))
					{
						dp[i][j]=dp[i]
					}
				}
			}
		}
			
	}

}
