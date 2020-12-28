package function;

import java.util.Scanner;

public class FunctionOverloading {
	public static int sum(int a, int b) {
		int add = a + b;
		return add;
	}
	
	public static int sum(int a) {
		int add = a + 1;
		return add;
	}
	
	public static double sum(double a, double b) {
		double add = a + b;
		return add;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		
		System.out.println(sum(num1,num2));
		System.out.println(sum(num1));
		System.out.println(sum(10.5,1.1));

	}
}
