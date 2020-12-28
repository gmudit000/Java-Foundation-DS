package time_complexity;

//here time complexity is O(n)
public class arrayEquilibrium2 {
	
	public static int ArrEquilibrium(int[] arr) {
			int i = 0;
			int leftsum = 0;
			for(int lsum = 0 ; lsum <i ;lsum++) {
				leftsum += arr[lsum];
			}
			
			int rightsum = 0;
			for(int rsum = i+1 ; rsum<arr.length;rsum++) {
				rightsum += arr[rsum];
			}
			
			if(leftsum == rightsum) {
				return i;
			}
			
			for(i = 1; i<arr.length ; i++) {
				leftsum += arr[i-1];
				rightsum -= arr[i];
				
				if(leftsum == rightsum) {
					return i;
				}
			}
			
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = {2,3,10,-10,4,2,9};
		System.out.println(ArrEquilibrium(arr));
	}

}
