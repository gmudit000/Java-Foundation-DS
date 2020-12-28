package recursion_ques;

public class Multiplication {

	public static int multiply(int m, int n, int sno) {
		if(sno == 0) {
			return 0;
		}
		
		if(sno == 1) {
			return m;
		}
		
		int smallAns = multiply(m, n, sno-1);
		int ans = m + smallAns;
		return ans;
	}
	
	public static void main(String[] args) {
		System.out.println(multiply(4,0,0));
	}

}
