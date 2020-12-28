package search_sort;


public class MergeTwoSortedArray {
	
	public static void printArray(int[] arr) {
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static int[] mergeTwoSort(int[] arr1, int[] arr2) {
		int[] arr3 = new int[arr1.length + arr2.length];
		int i =0,j =0;
		int k = 0;
		
		// it will run till either arr1 or arr2 left is exhausted 
		
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i] <= arr2[j]) {
				arr3[k] = arr1[i];
				k++;
				i++;
			}
			else {
				arr3[k] = arr2[j];
				k++;
				j++;
			}
		}
		// if arr1 elements are left -> blindly all left elements in arr3
		while(i<arr1.length) {
				arr3[k] = arr1[i];
				k++;
				i++;
		}
		// if arr2 elements are left -> blindly all left elements in arr3
		while(j<arr2.length) {
				arr3[k] = arr2[j];
				k++;
				j++;
		}
		return arr3;
		
	}

	public static void main(String[] args) {
		int arr1[] = {1,4,6,10,13};
		int arr2[] = {2,5,7,9};
		printArray(arr1);
		System.out.println();
		printArray(arr2);
		System.out.println();
		int[] res = mergeTwoSort(arr1,arr2);
		printArray(res);

	}

}
