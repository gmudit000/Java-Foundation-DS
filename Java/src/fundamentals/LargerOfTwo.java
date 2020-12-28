package fundamentals;
import java.util.Scanner;
public class LargerOfTwo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		//if you type equal number . check output
		
		int i=0;
		   while(i<10)
		   {
		       i=i+1;
		       System.out.print(i);
		       i=i+1;
		   }
		
		
		if(a>b) {
		System.out.println("First num is larger");
		}
		else if(b>a) {
			System.out.println("Second num is larger");
		}
		else {
			System.out.println("Both are equal");
		}
		
		/*
		if(a==b) {
			System.out.println("Both are equal");
		}
		else {
			if(a>b) {
				System.out.println("first is larger");
			}
			else {
				System.out.println("Second num is larger");
			}
		}
		*/
		
		
//		if(a>b) {
//			System.out.println("First num is larger");
//		}
//		else {
//			if(b>a) {
//				System.out.println("Second num is larger");
//			}
//			else {
//				System.out.println("Both are equal");
//			}
//		}
		System.out.println("Outside if-else");
	}
}
