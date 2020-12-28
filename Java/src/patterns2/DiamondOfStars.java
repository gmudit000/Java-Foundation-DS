package patterns2;
import java.util.Scanner;

public class DiamondOfStars {

	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			
			int n1 = (n+1)/2;
			int n2 = n1-1;
			
			// 1st half
			int i = 1;
			while(i<=n1) {
				int space = 1;
				while(space <= n1-i) {
					System.out.print(" ");
					space +=1;
				}
				
				int star = 1;
				while(star <= 2*i -1) {
					System.out.print("*");
					star +=1;
				}
				System.out.println();
				i = i+1;
			}
			
			//2nd half
			int j = n2;
			while(j>=1) {
				int space = 1;
				while(space <= n2 - j +1) {
					System.out.print(" ");
					space +=1;
				}
				
				int star = 1;
				while(star <=2*j - 1) {
					System.out.print("*");
					star += 1;
				}
				
				System.out.println();
				j = j-1;
			}
	}
}