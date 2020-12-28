package patterns2;
import java.util.Scanner;
public class Isosceles_triangle {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int p = n;
		// for rows
		int i = 1;
		while(i<=n) {    
		        //for spaces
		        int space =1;
		        while(space<=n-i){
		            System.out.print(' ');
		        	space += 1;
		        }
		        
		        //for num
		        int num = 1;
		        while(num<=i) {
		        	System.out.print(num);
		        	num +=1;
		        }
		        
		        //for decresing num
		        int dec = i-1;
		        while(dec>=1) {
		        	System.out.print(dec);
		        	dec = dec - 1;
		        }
			System.out.println();		// new line
			i = i+1;
		}
	}
}
