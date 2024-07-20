package mccp;
import java.util.*;

class day2_4{
public static void customSort(Integer []arr)
{
	HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
	for (int x : arr) {
		if(h.containsKey(x)){
			h.put(x, h.get(x)+1);
		}
		else{
			h.put(x, 1);
		}
	}
	Arrays.sort(arr, new Comparator<Integer>(){
		public int compare(Integer a, Integer b) 
		{
			if ((a % h.get(a)) == (b % h.get(b))) {
				return a < b?-1:1;
			}
			return ((a % h.get(a)) < (b % h.get(b)))?-1:1;
		}
		
	});
	for (int x : arr) {
		System.out.print(x +" ");
	}
}
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Integer[] arr = new Integer[n];
    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }
	customSort(arr);
}
}
