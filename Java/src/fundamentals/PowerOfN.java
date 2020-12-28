package fundamentals;
import java.util.Scanner;

public class PowerOfN {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();		//number
		int n = s.nextInt(); 		//base
		
		int Prod = 1;
		int i =1;
		
		if(x ==0 && n ==0) {
			System.out.println(Prod);
			return;
		}
		
		while(i<=n) {
			Prod = Prod * x;
			i = i+1;		
		}
		//System.out.println("x" + "^" + "n");
		System.out.print(Prod);
	}
}
