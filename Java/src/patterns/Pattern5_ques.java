package patterns;
import java.util.Scanner;
public class Pattern5_ques {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int i = 1; // rows
		while(i<=n) {
			int j = 1; // columns
			while(j<=n) {
				System.out.print(n);
				j=j+1;
			}
			System.out.println();
			i = i+1;
		}
	}
}