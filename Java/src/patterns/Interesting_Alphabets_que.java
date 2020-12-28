package patterns;

import java.util.Scanner;

public class Interesting_Alphabets_que {

	public static void main(String[] args) {
		
		//tri-char-pattern
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        while(i <= n){
            char p = (char)('A' + (n-i));	// p is reinitialized acc. to ith row
            int j = 1;
            while(j <= i){
                System.out.print(p);		// printing p
                p = (char)(p+1);			// incrementing p
                j = j+1;
            }
            System.out.println();
            i = i+1;
        }
	}
}
