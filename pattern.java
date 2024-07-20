package mccp;

import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); 
		int n=sc.nextInt();
		char st='A';
		int s=1;
for(int i=1;i<=n;i++)
{
	for(int j=1;j<=n-i;j++)
	{
		System.out.print(" ");
	}
	for(int j=1;j<=i;j++)
	{
		System.out.print(j);
	}
	for(int j=i-1;j>=1;j--)
	{
		System.out.print(j);
	}
	for(int j=1;j<=n-i;j++)
	{
		System.out.print(" ");
	}
	System.out.println();
}
for(int i=1;i<n;i++)
{
	for(int j=1;j<=n-i;j++)
	{
		System.out.print(j);
	}
	System.out.println();
}
	}
}
