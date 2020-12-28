package fundamentals;
import java.util.Scanner;
public class PrimeNoTillN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();	// N
		for(int pointer = 2; pointer <= N ; pointer++) {
				int count = 0;
				for(int div = 2; div*div <=pointer; div++) {
					if(pointer%div == 0) {
						count++;
						break;
					}
				}
				if(count == 0) {
					System.out.println(pointer);
				}
			}
		}
	}