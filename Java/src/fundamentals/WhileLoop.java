package fundamentals;
import java.util.Scanner;
public class WhileLoop {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Hello value of n");
		int n = s.nextInt();
		
		int i = 1; // count
		
		while(i<=n) {
			System.out.println(i);
			i=i+1;
		}

		// Question
		
		 	int x=5;
		    int y=5;
		    while((x=5)==y)					// check for (x==y) condition also
		    {
		        System.out.println("Hello");
		        x++;
		        y++;
		    }
	}

}
