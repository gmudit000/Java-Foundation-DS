package arrays2d;

public class SpiralPrint {

	public static void main(String args[]){
		int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		
		
//        if (arr.length == 0) {
//            return;
//        }
        
        int rows = arr.length;
		int cols = arr[0].length;
		int rs = 0;
		int re = arr.length - 1;
		int cs = 0;
		int ce = arr[0].length - 1;
		
		
		int count = 0;
		while(count < rows*cols) {
			
			
			for(int i = cs;i<=ce; i++) {
				System.out.print(arr[rs][i] + " ");
				count++;
			}
			rs++;
			
			for(int i = rs;i<=re;i++) {
				System.out.print(arr[i][ce] + " ");
				count++;
			}
			ce--;
			
			for(int i = ce;i>=cs; i--) {
				System.out.print(arr[re][i] + " ");
				count++;
			}
			re--;
			
			for(int i = re;i>=rs; i--) {
				System.out.print(arr[i][cs] + " ");
				count++;
			}
			cs++;
            
		}
	}
}