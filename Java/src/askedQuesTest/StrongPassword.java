package askedQuesTest;
//package fundamentals;
//
//public class StrongPassword {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		import java.io.*;
//		import java.math.*;
//		import java.security.*;
//		import java.text.*;
//		import java.util.*;
//		import java.util.concurrent.*;
//		import java.util.regex.*;
//
//		public class Solution {
//
//		    // Complete the minimumNumber function below.
//		    static int minimumNumber(int n, String password) {
//		        // Return the minimum number of characters to make the password strong
//		        int AD = 0;
//		        int minLength = 6;
//		        
//		        if(n<6){
//		            return minLength - n;
//		        }
//		        
//		        for(int i =0; i<password.length();i++){
//		            char c = password.charAt(i);
//		            
//		            if(!(i>= 48 && i<=57)){
//		                AD++;
//
//		            }
//		            if(!(i>= 97 && i<=122)){
//		                AD++;
//		                break;
//		            }
//		            if(!(i>= 65 &&i<=90)){
//		                AD++;
//		                break;
//		            }
//		            if(!(i>= 33 &&i<=43)){
//		                AD++;
//		                break;
//		            }
//		        }
//		        return AD;
//		        
//
//		    }
//
//		    private static final Scanner scanner = new Scanner(System.in);
//
//		    public static void main(String[] args) throws IOException {
//		        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//		        int n = scanner.nextInt();
//		        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//		        String password = scanner.nextLine();
//
//		        int answer = minimumNumber(n, password);
//
//		        bufferedWriter.write(String.valueOf(answer));
//		        bufferedWriter.newLine();
//
//		        bufferedWriter.close();
//
//		        scanner.close();
//		    }
//		}
//
//
//	}
//
//}
