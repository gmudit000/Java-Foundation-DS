package time_complexity;

import java.util.Arrays;
public class UniqueElement {
	
		public static void print(int[] arr) {
			for(int i  = 0 ;i<arr.length ; i++) {
				System.out.print(arr[i] + " ");
			}
		}
	
		public static int uniqueElemenet(int[] arr) {
			Arrays.sort(arr);
			int MaxElement = arr[arr.length-1];
			
			int[] frequency = new int[MaxElement+1];
			
			for(int i=0 ;i<arr.length; i++) {
				frequency[arr[i]]++;
			}
			
			for(int i = 0 ;i<frequency.length; i++) {
				if(frequency[i] == 1) {
					return i;
				}
			}
			return -1;
		}
	
		public static void main(String[] args) {
			int[] arr = {1 ,3 ,1 ,3, 6, 6, 7, 10, 7};
			int ans = uniqueElemenet(arr);
			System.out.println(ans);
		}
}
