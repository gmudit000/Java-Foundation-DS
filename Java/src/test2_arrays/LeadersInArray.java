package test2_arrays;

public class LeadersInArray {
	public static void main(String[] args) {
		int arr[] = {3,12,34,2,0,-1};
			
			for(int i = 0 ; i<arr.length -1; i++){
				int j;
	            for(j = i+1; j<arr.length; j++){
	                if(arr[i] < arr[j]){
	                    break;
	                }   
	            }
	            if(j == arr.length){
	                System.out.print(arr[i] + " ");
	            }
	            
	        }
	        System.out.print(arr[arr.length-1]);
	}

}
