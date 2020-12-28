package search_sort;

public class Q2_RotateArray2 {
	public static void printArray(int[] arr) {
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6};
		printArray(arr);
		System.out.println();
		int arr1[] = new int[arr.length];
		int n = arr.length;
		
		int NoOfRotation = 2;
		int j = 0;
		while(j<NoOfRotation){
			for(int i=1 ; i<n ; i++) {
				arr1[i-1] = arr[i];
			}
			arr1[n-1] = arr[0];
			
			//copy all elements of arr1 to arr
			for(int c = 0; c<n ; c++) {
				arr[c] = arr1[c];
			}
			//
		j++;
		}
		
		printArray(arr);	
	}
}