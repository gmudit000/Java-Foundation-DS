package function;
import java.util.Scanner;
public class Ncr {
	
	// factorial function
	public static int factorial(int num) {
		int fact = 1;
		for(int i = 1; i<= num ; i++) {
			fact = fact*i;
		}
		return fact;
	}
	
	public static int ncr(int n, int r) {
		// function calling
		int FactN = factorial(n);
		int FactR = factorial(r);
		int FactNR = factorial(n-r);
		int result = FactN/(FactR*FactNR);
		return result;
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		// input n and r
		int n = s.nextInt();
		int r = s.nextInt();
		
		//function call
		int res = ncr(n,r);
		System.out.println(res);


//      without functions	
//		int FactN = 1;
//		for(int i = 1; i<=n ; i++) {
//			FactN = FactN*i;
//		}
//		
//		int FactR = 1;
//		for(int i = 1; i<=r ; i++) {
//			FactR = FactR*i;
//		}
//		
//		int FactNR = 1;
//		for(int i = 1; i<=n-r ; i++) {
//			FactNR = FactNR*i;
//		}	
	}
}
