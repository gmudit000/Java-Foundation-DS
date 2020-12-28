package arrays;

public class PairSum {
	
	public static int pair(int arr[], int x) {
		int count = 0;
		for(int i = 0; i< arr.length ;i++) {
			for(int j =i+1; j<arr.length ;j++) {
				if(arr[i] + arr[j] == x) {
				count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] arr = {2 ,8 ,10 ,5 ,-2, 5};
		int x = 10;
		int ans = pair(arr, x);
		System.out.println(ans);
	}

}
