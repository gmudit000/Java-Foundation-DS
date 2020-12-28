package arrays;

public class TripetSum {
	
	public static int pair(int arr[], int x) {
		int count = 0;
		for(int i = 0; i< arr.length ;i++) {
			for(int j =i+1; j<arr.length ;j++) {
				for(int z =j+1; z <arr.length; z++) {
					if(arr[i] + arr[j] + arr[z] == x) {
						count++;
					}
				}			
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7 };
		int x = 12;
		int ans = pair(arr, x);
		System.out.println(ans);
	}

}
