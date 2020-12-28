package patterns2;
import java.util.Scanner;

public class Parallelogram_Pattern_que {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int i = 1;
		while(i<=n) {
			int space = 1;
			while(space <= i-1) {
				System.out.print(' ');
				space += 1;
			}
			
			int star = 1;
			while(star <= n) {
				System.out.print('*');
				star +=1;
			}
			System.out.println();
			i = i+1;
		}
		

	}

}
