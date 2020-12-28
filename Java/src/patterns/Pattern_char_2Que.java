package patterns;
import java.util.Scanner;
public class Pattern_char_2Que {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int i = 1; // rows
		while(i<=n) {
			int j = 1; // columns
			while(j<=i) {
				char jthchar = (char)('A' + i -1);  
				System.out.print(jthchar);	
				j=j+1;
			}
			System.out.println();
			i = i+1;
		}
	}
}
