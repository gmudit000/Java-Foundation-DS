package search_sort;

public class SelectoinSort {
	
	public static void printArray(int[] arr) {
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void selectionSort(int[] arr) {
		
		int n = arr.length;
		for(int i = 0; i<n-1;i++) {
			int minVal = Integer.MAX_VALUE;
			int minIndex = -1;
			for(int j = i; j<n;j++) {
				if(arr[j] < minVal) {
					minVal = arr[j];
					minIndex = j;
				}
			}
			// swap arr[i] with arr[minIndex]
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}
	
	public static void main(String[] args) {
	int arr[] = {1,3,0,4,2,7,6};
	printArray(arr);
	System.out.println();
	selectionSort(arr);
	printArray(arr);
	}

}