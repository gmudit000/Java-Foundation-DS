package search_sort;

public class Q4_Sort012_two {
	
	public static void printArray(int[] arr) {
		for(int i =0; i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void sort012(int[] arr) {
		int n = arr.length;
		int l = 0;
		int m = 0;
		int h = n-1;
		
		while(m<=h) {
			if(arr[m] == 0) {
				//swap arr[m] with arr[l]
				int temp = arr[m];
				arr[m] = arr[l];
				arr[l] = temp;
				m++;
				l++;
			}
			else if(arr[m] == 1) {
				m++;
			}else {
				//swap arr[m] with arr[h]
				int temp = arr[m];
				arr[m] = arr[h];
				arr[h] = temp;
				h--;
			}
		}
		
	}
	
	public static void main(String[] args) {
		int arr[] = {0 ,1, 2, 0, 1, 2, 0};
		printArray(arr);
		System.out.println();
		
		sort012(arr);
		printArray(arr);
	}

}
