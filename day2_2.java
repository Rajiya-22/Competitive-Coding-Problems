package mccp;

import java.util.Scanner;

public class day2_2 {
	public static void sample(int[] arr,int n) {
		for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                int cube1 = arr[j] * arr[j] * arr[j];
                int cube2 = arr[j + 1] * arr[j + 1] * arr[j + 1];
                if (cube1 > cube2) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] a=new int[n];
for(int i=0;i<n;i++)
{
	a[i]=sc.nextInt();
}
sample(a,n);
	}

}
