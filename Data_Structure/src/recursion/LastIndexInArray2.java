package recursion;

public class LastIndexInArray2 {
	
	// approach 1
	// array copy
	public static int check(int[] a ,int x) {
		if(a.length == 0) {
			return -1;
		}
		
		int smallArray[] = new int[a.length - 1];
		for(int i = 1; i<a.length ; i++) {
			smallArray[i-1] = a[i];
		}
		
		int k = check(smallArray,x);
		if(k != -1) {
			return k+1;
		}else {
			if(a[0] == x) {
				return 0;
			}else {
				return -1;
			}
		}	
	}
	
	// approach - 2
	public static int checkBetter(int[] a, int si, int x) {
		if(si == a.length) {
			return -1;
		}
		
		int li = checkBetter(a,si+1,x);
		if(li != -1) {
			return li;
		}else {
			if(a[si] == x) {
				return si;
			}else {
				return -1;
			}
		}	
	}
	
	public static void main(String[] args) {
		int arr[] = {9,8,10,15,10};
		System.out.println(checkBetter(arr,0,10));

	}

}
