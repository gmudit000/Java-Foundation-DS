package time_complexity;

public class PairSum {

	public static int findPairSum(int[] arr, int target) {
		int count = 0;
		for(int i = 0;i<arr.length-1;i++) {
			for(int j = i+1; j<arr.length ; j++) {
				if(arr[i] + arr[j] == target) {
					count++;
				}
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,3,3,4,5,8,9,9,9,15};
		System.out.println(findPairSum(arr,12));
	}

}
