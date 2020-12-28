package patterns2;
import java.util.Scanner;
public class Inverted_NumPattern_que {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int p = n;
		// for rows
		int i = 1;
		while(i<=n) {
			// ith rows
			int j =1;
			while(j<=n-i+1) {
				System.out.print(p);
				j = j + 1;
			}
			System.out.println();
			i = i+1;
			p = p-1;
		}
	}
}
