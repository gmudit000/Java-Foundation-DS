package recursion;

public class powerFunction {

	// x^n
	public static int power(int x, int n) {
		if(n == 0) {
			return 1;
		}
		int smallerOutput = power(x,n-1);
		int Output = x*smallerOutput;
		return Output;
	}
	
	public static void main(String[] args) {
		System.out.println(power(3,2));

	}

}
