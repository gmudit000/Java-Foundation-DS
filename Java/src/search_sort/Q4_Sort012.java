package search_sort;

public class Q4_Sort012 {
	
	public static void printArray(int[] arr) {
		for(int i =0; i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static int[] sort012(int[] arr) {
		int k = 0;
		int arr1[] = new int[arr.length];
		int n = arr.length;
		int num = 0;
		while(num<=2) {
			for(int i = 0; i< n ; i++) {
				if(arr[i] == num) {
					arr1[k] = arr[i];
					k++;
				}
			}
			num++;
		}
		return arr1;
	}
	
	public static void main(String[] args) {
		int arr[] = {0 ,1 ,2 ,0 ,1, 2, 0};
		printArray(arr);
		System.out.println();
		
		int[] arr1 = sort012(arr);
		printArray(arr1);
	}

}
