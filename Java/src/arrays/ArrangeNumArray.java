package arrays;
import java.util.Scanner;

// 1 Approach 
public class ArrangeNumArray {

	public static void ArrangeArray(int[] arr, int n) {
		
			//odd num
			int i = 0;
			for(int o =1; o<=n ; o=o+2) {
				arr[i] = o;
				i++;
			}
			
			//even num
			for(int e =n; e >=2; e--) {
				if(e%2==0) {
					arr[i] = e;
					i++;
				}
			}
		
			// printing array
		for(int p =0; p<n; p++) {
			System.out.println(arr[p]);
		}
	}	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		ArrangeArray(arr, n);
		//System.out.println(arr);
	}
}