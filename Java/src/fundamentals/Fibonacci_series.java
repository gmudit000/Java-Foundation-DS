package fundamentals;
import java.util.Scanner;

public class Fibonacci_series {

	public static int fib(int n) {
		if(n ==1 || n==2) {
			return 1;
			}else {
			return (fib(n-1) + fib(n-2));	
			}
		}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		System.out.println(fib(num));
	}
	}
