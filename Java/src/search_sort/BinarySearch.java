package search_sort;

public class BinarySearch {

	public static int bsearch(int[] arr, int target) {
		
		int n = arr.length;
		int s = 0;
		int e = n-1;
		
		while(s<=e) {
			int m = (s+e)/2;
			if(arr[m] > target) {
				e = m-1; 
			}else if(arr[m] < target) {
				s = m+1; 
			}else {
				return m;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,4,6,10,15,20,21,24};
		int x = 10;
		int ans = bsearch(arr,x);
		System.out.println(ans);
	}
}