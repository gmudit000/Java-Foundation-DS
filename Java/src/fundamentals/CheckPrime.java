package fundamentals;
import java.util.Scanner;
public class CheckPrime {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();	// number to be checked
		
		int count = 0;
		for(int i = 2; i*i<=t ; i++) {
			if(t%i == 0) {
				count = count+1;
				break;  // if one divisor found then break
			}
		}
		if(count == 0) {
			System.out.println("it is prime");
		}
		else {
			System.out.println("It is not prime");
		}
		
	}
}