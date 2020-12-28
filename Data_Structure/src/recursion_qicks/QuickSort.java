package recursion_qicks;

public class QuickSort {
	
	public static int partition(int[] arr, int si, int ei) {
		
		int pivotElement = arr[si];
		int count = 0;
		for(int i = si+1 ; i<=ei; i++) {
			if(arr[i] < pivotElement) {
				count++;
			}
		}
		
		int temp = arr[si + count];
		arr[si + count] = pivotElement;
		arr[si] = temp;
		
		int i = si;
		int j = ei;
		while(i<j) {
			if(arr[i] < pivotElement) {
				i++;
			}else if(arr[j] >= pivotElement) {
				j--;
			}else {
				// swap
				temp = arr[i];
				arr[i]= arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		return si + count;
	}
	
	//quick sort
	public static void quicksort(int[] arr, int si, int ei) {
		// base condition
		if(si>=ei) {
			return;
		}
		
		int pivotIndex = partition(arr,si,ei);
		quicksort(arr,si,pivotIndex-1);
		quicksort(arr,pivotIndex+1,ei);
	}
	
	// print function
	public static void print(int[] arr) {
		for(int i = 0 ; i<arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {7,4,12,6,8,9,10,2};
		quicksort(arr,0,arr.length-1);
		print(arr);
	}
}
