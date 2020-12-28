package ques;
import java.util.Scanner;
public class dividend_divisor {
	
	public static int divide(int dividend, int divisor) {
	
		int count = 0;
		while(dividend>=divisor) {
			dividend = dividend - divisor;
			count++;
		}
		
		if(count >= Integer.MAX_VALUE) {
			return Integer.MAX_VALUE;
		}else {
			return count;	
		}
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter dividend");
		int dividend = s.nextInt();
		
		System.out.println("Enter divisor");
		int divisor = s.nextInt();
		
		int ans = divide(dividend,divisor);
		System.out.println("Ans = " + ans);
		
	}
}
