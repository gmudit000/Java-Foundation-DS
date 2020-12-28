package function;

public class FibonacciSeries {

		public static int fibo(int i){
	        if(i == 0){
	            return 0;
	        }else if(i == 1){
	            return 1;
	        }else{
	            return fibo(i-1) + fibo(i-2);
	        }
	    }
	    
		public static boolean checkMember(int n){
			for(int j = 0; ; j++){
	            int res = fibo(j);
	            
	            if(res<=n){
	                if(res == n){
	                    return true;
	                }
	            }else{
	                return false;
	            }
	        }
		}

	
	public static void main(String[] args) {
		boolean res = checkMember(557);
		System.out.println(res);
		
		// in CN editor checkout main code
		//System.out.println(FibonacciSeries.checkMember(557));
	}
}