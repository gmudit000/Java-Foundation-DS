package recursion_ques;

public class CountZeros {
	
	public static int count0(int num) {
		
		// if num is only 0
		if(num == 0) {
			return 1;
		}
		// base case
		if(num <10) {
			return 0;
		}
		
		int smallAns = count0(num/10);
		if(num%10 == 0) {
			return smallAns + 1;
		}else {
			return smallAns;
		}
	}

	public static void main(String[] args) {
		System.out.println(count0(102000));
	}

}
