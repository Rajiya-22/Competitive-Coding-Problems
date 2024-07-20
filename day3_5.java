package mccp;
import java.util.*;

public class day3_5 {
    public static void sortByAbsoluteDifference(int val, int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int diff1 = Math.abs(arr[i] - val);
                int diff2 = Math.abs(arr[j] - val);

                if (diff1 > diff2 || (diff1 == diff2 && i > j)) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int val = sc.nextInt();
        sortByAbsoluteDifference(val, arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
