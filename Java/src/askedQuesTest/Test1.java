package askedQuesTest;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int row = s.nextInt();
			
		for(int i = 1; i <= row; i++) {
			int print = row;
			for(int inc = 1; inc<=row - i; inc++) {
				System.out.print(print);
				print--;
			}
			System.out.print("*");
			
			int print2 = i-1;
			for(int set = 1; set <=i-1; set++) {
				System.out.print(print2);
				print2--;
			}
			System.out.println(); // new line
		}
		
	}
}