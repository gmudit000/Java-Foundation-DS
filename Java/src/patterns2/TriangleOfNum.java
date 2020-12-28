package patterns2;
import java.util.Scanner;
public class TriangleOfNum {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        while(i<=n) {
        	int p = i;
        	int space = 1;
        	while(space <=n-i) {
        		System.out.print(" ");
        		space = space+1;
        	}
        	
        	int IncNos = 1;
        	while(IncNos <= i) {
        		System.out.print(p);
        		IncNos +=1;
        		p = p+1;
        	}
        	
        	int DecNos = 2*i-2;
        	while(DecNos > i-1) {
        		System.out.print(DecNos);
        		DecNos -= 1;
        	}
        	
        	System.out.println();
        	i = i+1;
        }
	}
}