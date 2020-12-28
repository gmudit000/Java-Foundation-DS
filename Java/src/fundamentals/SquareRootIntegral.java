package fundamentals;
import java.util.Scanner;
public class SquareRootIntegral {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int i = 0;
		while(i*i<=num) {
			i = i+1;
		}
		System.out.println(i-1);
	}
}