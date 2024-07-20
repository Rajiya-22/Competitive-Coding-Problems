package mccp;
import java.util.*;
public class adjacency_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter n:");
		int n=sc.nextInt();
		int[][] a=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=0;
			}
		}
		int x=1;
		while(x==1)
		{
			System.out.print("enter the vertices that has edge u and v between 0 to n-1");
			int u=sc.nextInt();
			int v=sc.nextInt();
			a[u][v]=1;
			System.out.print("Do you want to add any edges? if yes 1 else 0");
			x=sc.nextInt();
			if(x==0)
			{
				break;
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
