package fundamentals;
import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int Bin = s.nextInt();
		
		int Dec = 0;
		int P = 1;
			while(Bin != 0) {
				Dec = Dec + ((Bin%10)*P);
				Bin = Bin/10;
				P = P*2;
			}
		System.out.println(Dec);
	}
}