package patterns2;
import java.util.Scanner;

public class OddSquare_que {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int i = 1;  // for rows start from 1
		int z = 1;  // start vertical from 1
		while(i<=n) {
			
				int p = z;	// p is reinitialized every time
				int inc = 1;
				while(inc <= n-i+1) {
					System.out.print(p);
					p = p+2; // horizontal increment
					inc +=1;
				}
				
				int incSet2 = 1;
				int printValue = 1;
				while(incSet2 <= i-1) {
					System.out.print(printValue);
					printValue = printValue+2;// horizontal increment  
					incSet2 +=1;
				}
			
			System.out.println();
			i = i+1;
			z = z+2;  // vertical increment 
		}
	}
}