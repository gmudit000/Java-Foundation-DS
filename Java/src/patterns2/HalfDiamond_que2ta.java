package patterns2;
import java.util.Scanner;
/*
 * Solution from TA, explain in chatbox, visit that dated 20/8/20
 * 
 */

public class HalfDiamond_que2ta {

	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			int N = s.nextInt();
		    int numLines = (2*N) - 1;
		    
		    // Initial line
		    System.out.println('*');

			for(int i=1; i<=numLines; i++) {
		        int counter = 1;
		        int maxLimit = i;
			        if(i > N) {
			            maxLimit= numLines - i + 1;
			        }
		        
		        System.out.print('*');
		        while(counter < maxLimit) {
		            System.out.print(counter++);
		        }
		        
		        while(counter >= 1) {
		            System.out.print(counter--);
		        }
		        
		        System.out.println('*');
		    }
		    
		    // final line
		    System.out.println('*');
	}
}