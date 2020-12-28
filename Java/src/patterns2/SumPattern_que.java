package patterns2;
import java.util.Scanner;

public class SumPattern_que {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int i = 1;
		while(i<=n) {
			int sum = 0;
			int num = 1;
			while(num<=i) {
				System.out.print(num);
				sum += num;
				if(num == i) {
					//break;
					System.out.print('=');
				}
				else {
					System.out.print('+');
				}
				num +=1;
			}
			//System.out.print('=');
			System.out.print(sum);
			System.out.println();
			i = i+1;
		}
	}
	
}
