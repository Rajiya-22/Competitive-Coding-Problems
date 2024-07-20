package mccp;

import java.util.Scanner;

public class jun20_1 {
	public static void power(String s)
	{
		int n=(int) Math.pow(2, s.length());
		for(int i=0;i<n;i++)
		{
			String ans="";
			for(int j=0;j<s.length();j++)
			{
				if((i&(1<<j))>0)
				{
					ans+=s.charAt(j);
				}
			}
			System.out.println(ans);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		power(s);
	}

}
