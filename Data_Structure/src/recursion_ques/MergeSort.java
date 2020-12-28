package recursion_ques;

public class MergeSort {
	
	public static int[] Merge(int[] arr1, int[] arr2, int[] input) {
		int i = 0; 
		int j = 0;
		int k = 0;
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i] <= arr2[j]) {
				input[k] = arr1[i];
				k++;
				i++;
			}else {
				input[k] = arr2[j];
				k++;
				j++;
			}
		}
		
		while(i<arr1.length) {
			input[k] = arr1[i];
			k++;
			i++;
		}
		while(j<arr2.length) {
			input[k] = arr2[j];
			k++;
			j++;
		}
		return input;
	}
	
	public static void mergeSort(int[] input) {
		if(input.length <=1) {
			return;
		}
		
		int mid = input.length/2;
		// 1st half
		int[] arr1 = new int[mid];
		for(int i = 0 ; i<mid; i++) {
			arr1[i] = input[i];
		}
		// 2nd half
		int[] arr2 = new int[input.length - mid];
		for(int i = mid,j = 0; i<input.length; i++) {
			arr2[j] = input[i];
			j++;
		}
		mergeSort(arr1);
		mergeSort(arr2);
		Merge(arr1,arr2, input);
	}
	
	public static void print(int[] a) {
		for(int i = 0 ; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void main(String[] args) {
		int[] input = {5,2,5,1,3,9,8};
		print(input);
		System.out.println();
		mergeSort(input);
		print(input);
	}
	

}
