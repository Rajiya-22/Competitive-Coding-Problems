package mccp;
import java.util.*;
public class jun25_1 {
//	public static void paths(int m,int n,int[][] a)
//	{
//		int[][] dp=new int[m][n];
//		dp[0][0]=a[0][0];
//		for(int i=1;i<m;i++)
//		{
//			dp[i][0]=dp[i-1][0]+a[i][0];
//		}
//		for(int i=1;i<n;i++)
//		{
//			dp[0][i]=dp[0][i-1]+a[0][i];
//		}
//		for(int i=1;i<m;i++)
//		{
//			for(int j=1;j<n;j++)
//			{
//				dp[i][j]=Math.min(dp[i-1][j], dp[i][j-1])+a[i][j];
//			}
//		}
//		System.out.print(dp[m-1][n-1]);
//	}
	public static int paths(int m,int n,int[][] a)
	{
		if(m==0 && n==0)
		{
			return a[0][0];
		}
		if(m==0)
		{
			return paths(m,n-1,a)+a[m][n];
		}
		if(n==0)
		{
			return paths(m-1,n,a)+a[m][n];
		}
		else
		{
			return Math.min(paths(m-1,n,a),paths(m,n-1,a))+a[m][n];
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[][] a=new int[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.print(paths(m-1,n-1,a));
	}

}
