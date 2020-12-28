package recursion;

public class NumberOfDigits {

	public static int count(int n) {
		if(n == 0) {
			return 0;
		}
		int smallAns = count(n/10);
		int ans = smallAns + 1;
		return ans;
	}
	
	public static void main(String[] args) {
		System.out.println(count(109090));
	}
}