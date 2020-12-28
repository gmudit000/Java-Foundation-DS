package time_complexity;

import java.util.Arrays;
public class DuplicateElements {
	
		public static void print(int[] arr) {
			for(int i  = 0 ;i<arr.length ; i++) {
				System.out.print(arr[i] + " ");
			}
		}
	
		public static int dupElemenet(int[] arr) {
			Arrays.sort(arr);
			int MaxElement = arr[arr.length-1];
			
			int[] frequency = new int[MaxElement+1];
			
			for(int i=0 ;i<arr.length; i++) {
				frequency[arr[i]]++;
			}
			
			for(int i = 0 ;i<frequency.length; i++) {
				if(frequency[i] == 2) {
					return i;
				}
			}
			return -1;
		}
		
		public static int anotherMethodDup(int[] arr) {
			Arrays.sort(arr);
			for(int i = 0; i<arr.length ; i++) {
				if(arr[i] == arr[i+1]) {
					return arr[i];
				}
			}
			return -1;
		}
	
		public static void main(String[] args) {
			int[] arr = {0 ,7 ,2 ,5 ,4 ,7 ,1 ,3, 6};
//			int ans = dupElemenet(arr);
//			System.out.println(ans);
			System.out.println(anotherMethodDup(arr));
		}
}
