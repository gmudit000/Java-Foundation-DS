package time_complexity;

public class Binary_search_analysis {
	
	public static int binarySearchRecursion(int[] arr,int si, int ei, int target) {
		if(si<=ei) {
			int mid = (si + ei)/2;
			if(arr[mid] == target) {
				return mid;
			}
			
				if(arr[mid] > target) {
					return binarySearchRecursion(arr,si,mid-1,target);
				}else{
					return binarySearchRecursion(arr,mid+1,ei,target);
				}
		}
		return -1;
		
	}

	public static int binarySearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length-1;
		
		while(start<=end) {
			int mid = (start + end)/2;
			if(arr[mid] > target) {
				end = mid - 1;
			}else if (arr[mid] < target) {
				start = mid + 1;
			}else {
				return mid;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[] = {1,50,51,52,53};
//		System.out.println(binarySearch(arr, 53));
		int ans = binarySearchRecursion(arr,0,arr.length-1,59);
		System.out.println(ans);
	}

}
