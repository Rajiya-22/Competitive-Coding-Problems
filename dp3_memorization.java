package mccp;

import java.util.*;

public class dp3_memorization {
	public static int stairs(int n)
	{
		if(n==1)
		{
			return 1;
		}
		else if(n==2)
		{
			return 2;
		}
		else if(n==3)
		{
			return 3;
		}
		else
		{
			return stairs(n-1)+stairs(n-2)+stairs(n-3);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print(stairs(n));
	}

}
