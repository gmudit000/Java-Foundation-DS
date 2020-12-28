package search_sort;

public class InsertionSort {

	public static void printArray(int[] arr) {
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void insertionSort(int[] arr) {
		int n = arr.length;
		// divide array into 2 groups sorted and unsorted, sorted is at 0 and unsorted starts from 1 index
		// take element from unsorted to sorted array
		for(int i = 1; i<n ; i++) {
			// insert ith element in sorted position
			int j = i-1;
			int temp = arr[i];
			
			while(j >= 0 && arr[j] > temp) {
				arr[j+1] = arr[j];
				j--;
			}
			
			//position will be j+1;
			arr[j+1] = temp;
		}
		
	}
	public static void main(String[] args) {
		int arr[] = {9,6,3,7,2,8,1,5};
		printArray(arr);
		System.out.println();
		insertionSort(arr);
		printArray(arr);

	}

}
