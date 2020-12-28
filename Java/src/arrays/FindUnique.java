package arrays;

public class FindUnique {

	public static int unique(int[] arr) {
		int n = arr.length;
        int ans = 0;
		int i;
		for(i =0; i<n; i++) {
            
            int count = 0 ;
			for(int j = 0; j<n; j++) {
				
                if(arr[i] == arr[j])
                	count++;
			}
            
            if(count ==1){
            ans = arr[i] ;
            break ;
            }
		}
        return ans;
	}
	
	public static void main(String[] args) {
	int arr[] = {2 ,4 ,7 ,2, 7};
	int ans = unique(arr);
	System.out.println(ans);
	}
}