package mccp;

import java.util.Scanner;

public class day3_7 {
	public static void p(String s) {
		String a="abcdefghijklmnopqrstuvwxyz";
		int v=0,c=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				c=c+a.indexOf(s.charAt(i)+1);
			}
			else
			{
				v=v+Character.getNumericValue(s.charAt(i));
			}
		}
		String res="";
		res=res+v;
		res=res+a.charAt(c-1);
		System.out.print(res);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        p(s);
	}

}
