package fundamentals;

import java.util.Scanner;

public class GreaterLessThan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Which option can be used to check out of two numbers one is positive and the other is negative (Numbers be a and b)
			Scanner s = new Scanner(System.in);
			int a = s.nextInt();
			int b = s.nextInt();
			
			if((a>0 && b<0) || (a<0 && b>0)){   // or if(a*b<0)
				System.out.println("True");
			}
			else {
				System.out.println("false");
			}
			
		//	System.out.println(Integer.MIN_VALUE);
			int aa=50;
		    int bb=Integer.MIN_VALUE;
		    if(aa/0==bb)					// runtime error
		    {

		        System.out.println("Hello");
		    }
		    else
		    {
		        System.out.println("Hi");
		    }
		}

	}
