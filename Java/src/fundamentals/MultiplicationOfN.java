package fundamentals;

import java.util.Scanner;

public class MultiplicationOfN {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		int i = 1;
		while(i<=10) {
			System.out.println(num*i);
			i = i+1;
		}
	}
}
