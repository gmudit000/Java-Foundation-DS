package askedQuesTest;
//package fundamentals;
//
//public class timeConversion {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		/*
//		 * 
//		 * import java.io.*;
//import java.math.*;
//import java.text.*;
//import java.util.*;
//import java.util.regex.*;
//
//public class Solution {
//
//    /*
//     * Complete the timeConversion function below.
//     */
//    static String timeConversion(String s) {
//        /*
//         * Write your code here.
//         */
//        int hour = Integer.parseInt(s.substring(0,2));
//        int minute = Integer.parseInt(s.substring(3,5));
//        int second = Integer.parseInt(s.substring(6,8));
//        String meridiem = s.substring(8,10);
//        
//        hour += ((meridiem.equals("PM") && hour != 12)?12:0);
//        hour -= ((meridiem.equals("AM") && hour == 12)?12:0);
//        
//        String res = (String.format("%02d",hour) + ":" + String.format("%02d",minute) + ":" +               String.format("%02d",second));
//        
//        return res;
//    }
//
//    private static final Scanner scan = new Scanner(System.in);
//
//    public static void main(String[] args) throws IOException {
//        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String s = scan.nextLine();
//
//        String result = timeConversion(s);
//
//        bw.write(result);
//        bw.newLine();
//
//        bw.close();
//    }
//}
//
//		 */
//		
////		String s = "7:05:45PM";
////		
////		String military = "";
////        String temp = "12:00:00";
////        
////        if(s == "12:00:00AM"){
////            military = "00:00:00";
////        }else if(s == "12:00:00PM"){
////            military = temp;
////        }else{
////            //s = s.substring(0,8);
////            military = s + temp;
////        }
////        
////        System.out.println(military.substring(0,8));
//    	}		
//	}
