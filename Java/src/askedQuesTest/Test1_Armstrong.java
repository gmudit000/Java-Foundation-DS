package askedQuesTest;
import java.util.Scanner;

public class Test1_Armstrong {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		int pow = num;
		int check = num;
		//cal count
		int count = 0;
		while(pow!=0) {
		count++;
		pow = pow/10;
		}
		
		int rem = 0;
		int ans = 0;
		
		while(num!=0) {
			rem = num%10;
			// cal pow(rem,rem)
			int prod = 1;
			
			for(int i = 1; i<= count; i++) {
				prod = prod*rem;
			}
			ans = ans + prod;
			num = num/10;
		}
		if(check == ans) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}
}