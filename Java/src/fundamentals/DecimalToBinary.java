package fundamentals;
import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		// answer can be long
		
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		long rem = 0;
		long p = 1;
        long ans = 0;
        while(num!=0){
            rem = num%2;
            ans = ans + rem*p;
            num = num/2;
            p = p*10;
        	}
		System.out.println(ans);
		}
}