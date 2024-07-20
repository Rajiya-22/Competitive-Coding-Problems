package mccp;

import java.util.*;

public class day2_3 {
	public static void sample(int[] arr,int n,int k) {
		int ind=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==k)
			{
				ind=i;
			}
		}
		ArrayList<ArrayList<Integer>> distances = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int d = Math.abs(ind - i);
            while (distances.size() <= d) {
                distances.add(new ArrayList<>());
            }
            distances.get(d).add(arr[i]);
        }
        int j = 0;
        for (ArrayList<Integer> list : distances) {
            Collections.sort(list);
            for (int i : list) {
                arr[j++] = i;
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
int k=sc.nextInt();
int[] a=new int[n];
for(int i=0;i<n;i++)
{
	a[i]=sc.nextInt();
}
sample(a,n,k);
	}

}
