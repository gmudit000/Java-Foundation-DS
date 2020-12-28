package recursion_ques;

public class sumOfNum {
	
	// iterative solution
	public static int sum(int num) {
		int sum = 0;
		while(num!=0) {
			sum = sum + (num%10);
			num = num/10;
		}
		return sum;
	}
	
	public static int sumRecursively(int num) {
		if(num == 0) {
			return 0;
		}
		int smallAns = sumRecursively(num/10);
		int Ans = smallAns + (num%10);
		return Ans;
	}

	
	public static void main(String[] args) {
		System.out.println(sumRecursively(9));
		
	}

}
