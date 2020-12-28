package recursion_ques;

public class Geometric_sum {

	public static double findgeoSum(int k) {
		if(k == 0) {
			return 1;
		}
		
		double smallAns = findgeoSum(k-1);
		double ans = smallAns + 1/(Math.pow(2, k));
		return ans;
	}
	
	public static void main(String[] args) {
		System.out.println(findgeoSum(3));

	}

}
