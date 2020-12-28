package patterns2;

import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        int i =1;
        while(i<=n){
            int space = 1;
            while(space <= n-i){
                System.out.print(' ');
                space += 1;
            }
            
            int starI = 1;
            while(starI <= i){
                System.out.print('*');
                starI += 1;
            }
            
            int starD = i-1;
            while(starD >=1){
                System.out.print('*');
                starD -= 1;
            }
            
            System.out.println();
            i = i+1;
        }

	}

}
