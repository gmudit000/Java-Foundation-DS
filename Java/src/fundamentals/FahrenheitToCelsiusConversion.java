package fundamentals;
import java.util.Scanner;
public class FahrenheitToCelsiusConversion {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int Start = s.nextInt();
		int End = s.nextInt();
		int step = s.nextInt();
		
		int i = Start;
		while(i<=End) {
			int C = (int)((5.0/9)*(i-32));    // either BEST WAY
			//int C = (i-32)*5/9;                 or this one
			System.out.println(i +"\t"+ C);
			i = i + step;
		}
	}
}