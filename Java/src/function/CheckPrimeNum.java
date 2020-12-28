package function;
import java.util.Scanner;
public class CheckPrimeNum {

	public static boolean checkPrime(int n) {
		boolean isPrime = true;
		for(int div =2; div*div<= n; div++) {
			if(n%div == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		boolean res = checkPrime(n);
		System.out.println(res);
	}

}
