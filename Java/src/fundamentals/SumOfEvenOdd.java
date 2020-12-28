package fundamentals;

import java.util.Scanner;

public class SumOfEvenOdd {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		int sumEven = 0;
		int sumOdd = 0;
		int D;
		while(num != 0) {
			D = num%10;
			if(D%2==0) {
				//even num
				sumEven = sumEven + D;
			}else {
				sumOdd = sumOdd + D;
			}		
			num = num/10;
		}
		System.out.println(sumEven + " " + sumOdd);
	}
}