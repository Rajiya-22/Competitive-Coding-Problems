package mccp;

import java.util.Scanner;

public class day3_4 {
	public static void p(String s) {
		String res="";
		res=res+s.charAt(0);
		int i = 0;
        while (i < s.length()) {
            char currentChar = s.charAt(i);
            int repeatCount = i + 1;

            for (int j = 0; j < repeatCount; j++) {
            	res=res+s.charAt(j);
            }

            i += repeatCount;
        }
        System.out.print(res);
	}
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        p(input);
    }
}
