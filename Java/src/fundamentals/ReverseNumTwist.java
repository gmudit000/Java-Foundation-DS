package fundamentals;
import java.util.Scanner;
public class ReverseNumTwist {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		int revNum = 0;
		
		while(num != 0) {
			revNum = revNum*10 + num%10;
			num = num/10;
		}
		System.out.println(revNum);
	}
}