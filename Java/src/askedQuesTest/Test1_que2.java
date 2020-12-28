package askedQuesTest;
import java.util.Scanner;

public class Test1_que2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int row = s.nextInt();
		
		for(int i = 1; i<= row; i++) {
			//part1
			for(int zeros = 1; zeros <= i-1; zeros++) {
				System.out.print("0");
			}
			System.out.print("*");
			for(int zeros2 = 1; zeros2 <= row-i; zeros2++) {
				System.out.print("0");
			}
			//*
			System.out.print("*");
			
			//part2
			for(int zeros = 1; zeros <= row-i; zeros++) {
				System.out.print("0");
			}
			System.out.print("*");
			for(int zeros2 = 1; zeros2 <= i-1; zeros2++) {
				System.out.print("0");
			}
			
			System.out.println(); // new line
		}
		
	}
}