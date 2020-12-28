package arrays;

public class UniqueElementSol {  

	    public static int findUnique(int[] arr){
			//Your code goes here
	        int n = arr.length;
	        int ans = 0;
			int i;
			for(i =0; i<n; i++) {
	            
	            int count = 0 ;
				for(int j = 0; j<n; j++) {
					
	                if(arr[i] == arr[j] )
	                	count++ ;
				}
	            
	            if(count ==1){
	            ans = arr[i] ;
	            break ;
	            }
			}
	        return ans  ;
	    }
}