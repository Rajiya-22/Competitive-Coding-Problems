package mccp;
import java.util.*;
public class day2_6 {

	    public static String decryptString(String encrypted) {
	        int n = encrypted.length();
	        StringBuilder decrypted = new StringBuilder();
	        
	        decrypted.append(encrypted.charAt(0));

	        for (int i = 1; i < n; i++) {
	            if (i % 2 == 1) {
	                decrypted.append(encrypted.charAt(i));
	            } else {
	                decrypted.insert(0, encrypted.charAt(i));
	            }
	        }

	        return decrypted.toString();
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the encrypted string: ");
	        String encryptedString = sc.nextLine();

	        String decryptedString = decryptString(encryptedString);

	        System.out.println("Decrypted String: " + decryptedString);
	    }
	}


	

	


