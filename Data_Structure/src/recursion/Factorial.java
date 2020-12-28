package recursion;

public class Factorial {
	
	public static int fact(int n) {
		
		// stoping condition
		if(n == 0) {
			return 1;
		}
		
		int smallerOutput = fact(n-1);
		int Output = n * smallerOutput;
		return Output;
	}
	
	public static void main(String[] args) {
		System.out.println(fact(6));

	}

}
