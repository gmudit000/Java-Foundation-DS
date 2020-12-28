package patterns;
import java.util.Scanner;
public class Pattern_tri_2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int p = 1;

		int i = 1; // rows
		while(i<=n) {
			int j = 1; // columns
			while(j<=i) { // i columns
				System.out.print(p);
				p = p+1;
				j=j+1;
			}
			System.out.println();
			i = i+1;
		}
	}
}