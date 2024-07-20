package mccp;

import java.util.Scanner;

public class day3_3 {

    public static void p(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if (i + 2 < s.length() && s.charAt(i) == s.charAt(i + 1) && s.charAt(i + 1) == s.charAt(i + 2)) {
                res=res+s.charAt(i);
                i += 2; 
            } else {
            	res=res+s.charAt(i);
            }
        }
        String r="";
        for (int i = 0; i < res.length(); i++) {
            if (i + 3 < res.length() && res.charAt(i) == res.charAt(i + 1) && res.charAt(i + 2) == res.charAt(i + 3)) {
                r=r+res.charAt(i);
           } 
        }

        System.out.println(r);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        p(input);
    }
}
