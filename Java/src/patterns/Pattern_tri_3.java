package patterns;
import java.util.Scanner;
public class Pattern_tri_3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		

		int i = 1; // rows
		while(i<=n) {
			int p = i;	// p is reintialized again acc to i
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