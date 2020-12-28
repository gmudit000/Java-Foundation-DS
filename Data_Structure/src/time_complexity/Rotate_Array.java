package time_complexity;

public class Rotate_Array {
	
	public static void print(int[] arr) {
		for(int i  = 0 ;i<arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	// time complexity is bad here
	public static void rotateIt(int[] arr, int d) {
		int j = 1;
		while(j <= d) {
			int temp = arr[0];
			for(int i = 1; i <arr.length; i++) {
				arr[i-1] = arr[i];
			}
			arr[arr.length - 1] = temp; 
			j++;
		}
	}
	
	// still better
	public static void rotateIt2(int[] arr, int d) {
		int[] newArr = new int[d];
		for(int i = 0; i<d; i++) {
			newArr[i] = arr[i];
		}
		
		for(int i = d; i <arr.length ; i++) {
			arr[i-d] = arr[i];
		}
		
		int j =arr.length-d; 
		for(int i = 0 ;i<newArr.length ; i++) {
			arr[j] = newArr[i];
			j++;
		}
	}
	
	// new approach
	public static void swapIt(int[] arr, int i , int j) {
		while(i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}
	
	public static void rotateIt3(int[] arr, int d) {
		// swap all elements
		int i = 0;
		int j = arr.length-1;
		swapIt(arr, i ,j);
		
		// swap 0 to n-d elements
		i = 0;
		j = arr.length - d - 1;
		swapIt(arr, i,j);
		
		// swap n-d to end 
		i = arr.length - d;
		j= arr.length-1;
		swapIt(arr, i,j);
	}
	
	public static void main(String[] args) {
		int[] arr = {2,6,3,1,5,9,8};
		print(arr);
		rotateIt3(arr, 2);
		System.out.println();
		print(arr);
	}

}
