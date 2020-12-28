package test2_arrays;

public class NegativePositiveNum {

	public static void printArray(int[] arr) {
		for(int i =0; i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static int[] sortZeroesAndOne(int[] arr) {
        int n = arr.length;
        int left = 0, right = n-1;
        while(left<right) {
        	
        	// loop will stop when arr[left] -> positive num
        	while(arr[left] <0 && left<right) {
        		left++;
        	}
        	// loop will stop when arr[right] -> negative num
        	while(arr[right] >0 && left<right) {
        		right--;
        	}
        	if(left<right) {
        		// swap it
        		int temp = arr[left];
        		arr[left] = arr[right];
        		arr[right] = temp;
        		left++;
        		right--;
        	}
        }
        return arr;
        
    }
	
	public static void main(String[] args) {
		int arr[] = {3, -9, 5, -1, 2, 6, 7, -10, -12};
		printArray(arr);
		System.out.println();
		int[] ans = sortZeroesAndOne(arr);
		printArray(ans);
	}
}
