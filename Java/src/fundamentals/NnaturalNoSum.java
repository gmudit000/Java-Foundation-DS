package fundamentals;

import java.util.Scanner;

public class NnaturalNoSum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Hello value of n");
		int n = s.nextInt();
		
		int sum = 0;
		int i = 1;		// next num to added
		while(i<=n) {
			sum = sum + i;
			i=i+1;
		}
		System.out.println("Sum is " + sum);
	}
}
