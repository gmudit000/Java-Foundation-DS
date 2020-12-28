package arrays;
//Approach 2
public class SortZeroOne2 {
	
	public static void printArray(int[] arr) {
		for(int i =0; i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		int arr[] = {0,1,0,1,1,1};
		printArray(arr);
		System.out.println();
		
		int count = 0;
		// cal no of zeros
		for(int i =0; i<arr.length;i++) {
			if(arr[i] == 0) {
				count++;
			}
		}
		
		for(int i = 0; i<arr.length; i++) {
			// print no zeros
			if(i<count) {
				System.out.print("0" + " ");
			}
			// print no ones
			else {
				System.out.print("1" + " ");
			}
		}
	}
}