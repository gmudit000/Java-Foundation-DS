package search_sort;

public class Q5_SumOfTwoArrays {
	
	public static void printArray(int[] arr) {
		for(int i =0; i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static int[] sumoftwoArr(int[] arr1, int[] arr2, int[] outputArr) {
		int n = arr1.length;
		int m = arr2.length;
		int o = outputArr.length;
				int k = o-1;
				int i = n-1;
				int j = m-1;
				int carry = 0;	
				int num = 0;
				while(i>=0 &&j>=0) {
					num = arr1[i] + arr2[j] + carry;
					outputArr[k] = num%10;
					carry = num/10;
					k--;
					i--;
					j--;
				}
				if(j<0) {
					while(i>=0) {
						num = arr1[i] + carry;
						outputArr[k] = num%10;
						carry = num/10;
						k--;
						i--;
					}
				}
				if(i<0) {
					while(j>=0) {
						num = arr1[j] + carry;
						outputArr[k] = num%10;
						carry = num/10;
						k--;
						j--;
					}
				}
				// if both condition don't work and store at outputArr[0] element
				outputArr[k] = carry;
				return outputArr;
			}
	
	public static void main(String[] args) {
		int[] arr1 = {6,2,4};
		int[] arr2 = {7,5,6};
		
		int m = 0;
		if(arr1.length>arr2.length) {
			m= arr1.length+1;
		}else if(arr1.length<arr2.length) {
			m= arr2.length+1;
		}else {
			m= arr1.length+1;
		}
		
		int[] outputArr = new int[m];
		System.out.println(m);
		int[] ans = sumoftwoArr(arr1,arr2,outputArr);
		printArray(ans);
	}

}
