package fundamentals;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		// if you type zero . check output
		
		
		if(num%2==0) {
			System.out.println("Num is even");
		}else {
			System.out.println("Num is odd");
		}
		System.out.println("Outside if-else");
		
		int a =440 , b= 88;
		if(a>b) {
			System.out.println("Coding");
		}
		else{
			System.out.println("Coding");

		}

	}

}
