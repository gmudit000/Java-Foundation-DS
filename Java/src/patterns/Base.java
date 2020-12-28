package patterns;
import java.util.Scanner;
public class Base {
	
	//Pattern1

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int i = 1; // rows
		while(i<=n) {
			int j = 1; // columns
			while(j<=n) {
				System.out.print("*");
				j=j+1;
			}
			System.out.println();
			i = i+1;
		}
	}
}
