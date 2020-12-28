package arrays;

public class DuplicateElements {

	public static int unique(int[] arr) {
		int ans = 0;
		int n = arr.length;
		int i;
		for(i =0; i<n; i++) {
			for(int j = i+1; j<n; j++) {
				if(arr[j] == arr[i]) {
					ans = arr[i];
					break;
				}
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
	int arr[] = {0,2,1,3,1};
	int ans = unique(arr);
	System.out.println(ans);
	}
}