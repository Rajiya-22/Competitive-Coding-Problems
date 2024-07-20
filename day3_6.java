package mccp;

import java.util.Scanner;

public class day3_6 {
    public static void p( int[] arr) {
    	int a=0;
    	boolean flag=true;
    	int b=arr.length-1;
    	int res[]=new int[arr.length];
    	for(int i=0;i<arr.length;i++)
    	{
    		if(flag)
    		{
    			res[i]=arr[b];
    			b--;
    		}
    		else
    		{
    			res[i]=arr[a];
    			a++;
    		}
    		flag=!flag;
    	}
    	for(int i=0;i<res.length;i++)
    	{
    		System.out.print(res[i]+" ");
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        p(arr);
	}

}
