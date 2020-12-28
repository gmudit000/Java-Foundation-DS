package search_sort;

public class CheckArrayRotatio {

	public static int checkRotationNo(int[] arr) {
		int min = Integer.MAX_VALUE;
		int minIndex = 0;
		int n = arr.length;
		
		int i;
		for(i = 0; i<n; i++) {
			if(min > arr[i]) {
				min = arr[i];
				minIndex = i;
			}
		}
		return minIndex;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[0];
		int ans = checkRotationNo(arr);
		System.out.println(ans);
	}

}