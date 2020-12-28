package fundamentals;

import java.util.Scanner;

public class CheckCaseOfString {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String ch =s.next();
		char c = ch.charAt(0);
		
		if(c>=65 && c<=90) {		// Capital
			System.out.println("1");
		}else if(c>=97 && c<=122){	// Small
			System.out.println("0");
		}else {
			System.out.println("-1");
		}
		

	}

}
