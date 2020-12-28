package patterns2;
import java.util.Scanner;

public class HalfDiamond_que {

	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			int N = s.nextInt();
        	 if(N == 0){
        	 System.out.println('*');
        	 System.out.println('*');
        	 return;
        	 }
			// output rows are (2*N) + 1
			int n = (2*N) + 1;
			
			// breaking code in two major parts - n1 , n2
			int n1 = (n+1)/2;
			int n2 = n1-1;
			
			
			int i = 1;
			while(i<=n1) {
				
						
						System.out.print('*');
						
						int Inc = 1;
						while(Inc <= i-1) {
							System.out.print(Inc);
							Inc+=1;
						}
						
						int Dec = 1;
						int printValue = i-2;
						while(Dec <=i-2) {
							System.out.print(printValue);
							Dec +=1; 
							printValue -= 1;
						}
						
						if(i != 1) {
							System.out.print('*');
						}
						
						System.out.println();
						i = i+1;
					}
			
			
						// part 2
						int j =n2;
						while(j>=1) {
							System.out.print('*');
			
							// increasing
							int Inc = 1;
							while(Inc <= j-1) {
								System.out.print(Inc);
								Inc +=1;
							}
							
							
							int Dec =1 ;
							int printValue = j-2;
							while(Dec <= j-2) {
								System.out.print(printValue);
								Dec +=1; 
								printValue -= 1;
							}
							
							if(j != 1) {
								System.out.print('*');
							}
							
							System.out.println();
							j = j-1;
						}
	}
}