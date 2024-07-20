package mccp;

import java.util.Scanner;

public class day2_5 {
public static void create(String s)
{
	String res="";
	res+=s.charAt(0);
	for(int i=1;i<s.length();i++)
	{
		char t=s.charAt(i);
		if(i%2==0)
		{
			res=t+res;
		}
		else
		{
			res=res+t;
		}
	}
	System.out.print(res);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    String s = sc.nextLine();
	    create(s);
	}

}
