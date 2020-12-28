package time_complexity;

import java.util.Arrays;

// write code to handle duplicate elements also, it is not taken care of

public class Intersection_of_Array {
	
	public static void intersection(int[] arr1, int[] arr2) {
		Arrays.sort(arr1);
		Arrays.sort(arr2);
        for(int i = 0; i<arr1.length; i++){
            for(int j = 0; j<arr2.length ; j++){
                if(arr1[i] == arr2[j]){
                    arr2[j] = Integer.MIN_VALUE;
                	System.out.print(arr1[i] + " ");
                    break;
                }
            }
        }
	}

	public static void main(String[] args) {
		int[] arr1 = {2 ,6 ,8, 2,5 ,4, 3};
		int[] arr2 = {2,3,4,7};
		intersection(arr1, arr2);
	}

}
