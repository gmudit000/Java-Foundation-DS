package patterns;
import java.util.Scanner;
public class Pattern_tri_1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int i = 1; // rows
		while(i<=n) {
			int j = 1; // columns
			while(j<=i) {
				System.out.print(j);
				j=j+1;
			}
			System.out.println();
			i = i+1;
		}
	}
}