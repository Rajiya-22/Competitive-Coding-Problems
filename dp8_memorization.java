package mccp;

import java.util.Scanner;

public class dp8_memorization {
	public static int allpaths(int m,int n,int i,int j) {
		if(m==i&& n==j)
		{
			return 1;
		}
		else
		{
			return allpaths( m, n, i-1, j)+allpaths( m, n, i, j-1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int i=0,j=0;
		System.out.print(allpaths(m,n,i,j));
	}

}
