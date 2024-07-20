package mccp;
import java.util.*;
public class jun22_1 {
	public static boolean isSubseq(String str1,String str2,int m,int n)
	{
		if(m<0)
		{
			return true;
		}
		if(n<0 && m<0)
		{
			return true;
		}
		if(n<0 && m>=0)
		{
			return false;
		}
//		if(m==0)
//		{
//			return true;
//		}
//		else if(n==0)
//		{
//			return false;
//		}
		if(str1.charAt(m)==str2.charAt(n))
		{
			return isSubseq(str1,str2,m-1,n-1);
		}
		else
		{
			return isSubseq(str1,str2,m,n-1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		System.out.print(isSubseq(str1,str2,str1.length()-1,str2.length()-1));
	}

}
