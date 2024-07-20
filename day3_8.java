package mccp;

import java.util.Scanner;

public class day3_8 {
	public static void p(String s,int x)
	{
		String alpha="ABCDEFGHIJKLMNOPQRSTUVWXYZ",res="";
		for(int i=0;i<s.length();i++)
		{
			s=s.toUpperCase();
			int n=s.charAt(i)-64;
			while(n+x>26)
			{
				n=n-26;
			}
			res=res+alpha.charAt(n+x-1);
		}
		System.out.print(res);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        int x=sc.nextInt();
        p(s,x);
	}

}
