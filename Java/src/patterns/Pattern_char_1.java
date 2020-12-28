package patterns;
import java.util.Scanner;
public class Pattern_char_1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int i = 1; // rows
		while(i<=n) {
			int j = 1; // columns
			while(j<=n) {
				char jthchar = (char)('A' + j -1);   // 'A' = 65 , (char)(65 + j - 1) , 1<j<n
				System.out.print(jthchar);	
				j=j+1;
			}
			System.out.println();
			i = i+1;
		}
	}
}
