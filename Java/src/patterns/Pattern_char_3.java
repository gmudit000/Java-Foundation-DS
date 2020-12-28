package patterns;
import java.util.Scanner;
public class Pattern_char_3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int i = 1; // rows
		while(i<=n) {
			char p = (char)('A' + i - 1);   // ith character
			int j = 1; // columns
			while(j<=n) {  
				System.out.print(p);		// print character
				p = (char)(p + 1);			// we have to typecast, as 1 is int,,,,, increment to next character
				j=j+1;
			}
			System.out.println();
			i = i+1;
		}
	}
}