package function;

public class PassByValue {

	public static void increment(int n) {
		n++;
		System.out.println("Increment " + n);
	}
	public static void main(String[] args) {
		int n = 10;
		increment(n);
		System.out.println("Main " + n);

	}

}
