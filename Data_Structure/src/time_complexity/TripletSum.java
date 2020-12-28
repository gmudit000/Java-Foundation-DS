package time_complexity;

public class TripletSum {
	// time complexity  is bad
	// error of TLE will come forsure
	// look for optimized solution
	public static int findTripletSum(int[] arr, int target) {
		int count = 0;
		for(int i = 0;i<arr.length-2;i++) {
			for(int j = i+1; j<arr.length-1 ; j++) {
				for(int z = j+1; z<arr.length; z++) {
					if(arr[i] + arr[j] + arr[z] == target) {
						count++;
					}
				}
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		int[] arr = {1 ,2 ,3 ,4 ,5 ,6, 7};
		System.out.println(findTripletSum(arr,12));
	}

}
