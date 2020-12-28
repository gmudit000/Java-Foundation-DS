package recursion;

public class SumNnatual {
	
	public static int sum(int n) {
		if(n == 0) {
			return 0;
		}
		int smallerOutput = sum(n-1);
		int Output = n + smallerOutput;
		return Output;
	}

	public static void main(String[] args) {
		System.out.println(sum(5));

	}

}
