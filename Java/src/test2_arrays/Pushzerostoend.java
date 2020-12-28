package test2_arrays;

public class Pushzerostoend {

	public static void print(int[] arr) {
		for(int i = 0 ; i< arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static int[] push(int[] arr) {
		int[] arr2 = new int[arr.length];
	
		int j = 0;
		for(int i = 0 ;i<arr.length ; i++) {
			if(arr[i] != 0) {
				arr2[j] = arr[i];
				j++;
			}
		}
		return arr2;
	}
	
	public static void main(String[] args) {
		int[] arr = {2,0,0,1,3,0,0};
		print(arr);
		System.out.println();   // new line
		
		int[] ans = push(arr);
		print(ans);
	}

}
