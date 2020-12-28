package Exception;


public class ExceptionDemo {
	
	public static int Fact(int n) throws NegativeNumberException {
		if(n<0) {
			throw new NegativeNumberException();
		}
		int ans = 1;
		for(int i = 2; i<=n ; i++) {
			ans = ans*i;
		}
		return ans;
	}
	
	public static int Divide(int a, int b) throws DivideByZeroException {
		if(b == 0) {
			throw new DivideByZeroException();
//			throw new ArithmeticException();
		}
		return a / b;
	}

	public static void main(String[] args) {
		try {
			Divide(10,4);
			System.out.println("Within try");
			System.out.println(Fact(-22));
			System.out.println("After fact 2");
		} catch (DivideByZeroException e) {
			System.out.println("Divide by zero exception raised");
		} catch(NegativeNumberException e) {
			System.out.println("Negative number exception raised");
		} catch(Exception e) {					// it is generic exception for any kind of exception occour
			System.out.println("Generic exception");
		} finally {
			System.out.println("Finally raised");
		}
		
		System.out.println("Main");
	
		// few imp questions
		
//		try{
//	        return;
//	    }
//	    finally{
//	        System.out.println("Hello coding ninjas");
//	    }
		
//	    try{
//	        int a = 5/0;
//	     }
//	     catch(Exception e){
//	         System.out.print("Exception caught ");
//	     }
//	    // after generic exception, no other exception will work, so compile time error
//	     catch(ArithmeticException e){
//	         System.out.print("Arithmetic Exception caught ");
////	    }
//	    finally{
//	        System.out.print("finally block");
//	    } 
		
		
	}

}
