package arrays;

public class IntersectionOfArray {

	public static void intersection(int[] arr1, int[] arr2) {
		int M = arr1.length;
		int N = arr2.length;
		
		for(int i = 0; i< M ;i++) {
			for(int j =0; j<N ;j++) {
				if(arr1[i] == arr2[j]) {
					arr2[j] = Integer.MIN_VALUE;
					System.out.print(arr1[i] + " ");
					break;
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] arr1 = {2 ,6 ,1 ,2}; 
		int[] arr2 = {1 ,2 ,3 ,4 ,2};
		intersection(arr1,arr2);
		//System.out.println(Integer.MIN_VALUE);
	}

}
