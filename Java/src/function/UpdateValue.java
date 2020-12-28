package function;

public class UpdateValue {

	public static int increment(int n) {
		n++;
		//System.out.println("Increment " + n);
		return n;
	}
	public static void main(String[] args) {
		int n = 10;
		//increment(n);				common mistake if miss to update n
		n = increment(n);			// stored the return value and n is updated
		System.out.println("Main " + n);

	}

}
