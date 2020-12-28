package time_complexity;


public class MergeSortAnalysis {
	
	// merging two sorted array
	public static int[] mergingTwoArrays(int[] arr1, int[] arr2,int[] arr) {
		
		int i = 0 , j = 0, k = 0;
		
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i] <= arr2[j]) {
				arr[k] = arr1[i];
				i++;
				k++;
			}else {
				arr[k] = arr2[j];
				j++;
				k++;
			}
		}
		
		// blindly copy all other elements
		while(i<arr1.length) {
			arr[k] = arr1[i];
			k++;
			i++;
		}
		
		while(j<arr2.length) {
			arr[k] = arr2[j];
			k++;
			j++;
		}
		
		return arr;
		
	}
	
	public static void mergeIt(int[] arr) {
		
		// base condition
		if(arr.length <= 1) {
			return;
		}
		
		int[] arr1 = new int[arr.length/2];
		int[] arr2 = new int[arr.length - arr1.length];
		
		// copying half elements in arr1
		for(int i = 0; i<arr.length/2;i++) {
			arr1[i] = arr[i];
		}
		
		// copying other half elements in arr2
		int j =0;
		for(int i = arr.length/2; i<arr.length;i++) {
			arr2[j] = arr[i];
			j++;
		}
				
		mergeIt(arr1);
		mergeIt(arr2);
		mergingTwoArrays(arr1,arr2,arr);
	}
	
	public static void print(int[] arr) {
		for(int i = 0 ; i <arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {88,4,3,2,59,9,80};
		mergeIt(arr);
		print(arr);
	}
}
