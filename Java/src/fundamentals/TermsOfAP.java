package fundamentals;

import java.util.Scanner;

public class TermsOfAP {

	public static void main(String[] args) {
		       Scanner s = new Scanner(System.in);
				int x = s.nextInt();
				int count = 0;
				for(int N = 1; ; N++) {
					int num = 3*N+2;
					
					if(num%4!=0) {
						System.out.print(num + " ");
						count +=1;
					}
					
					if(count==x) {
						break;
					}
						
				}

	}

}
