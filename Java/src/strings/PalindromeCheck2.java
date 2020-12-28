package strings;
import java.util.Scanner;
public class PalindromeCheck2 {

	public static boolean palindromeCheckit(String str) {
		for(int i = 0, j = str.length()-1 ;  i<j ; i++, j--) {
			
			if(!(str.charAt(i) == (str.charAt(j)))) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String str = s.next();
		boolean check = palindromeCheckit(str);
		System.out.println(check);
	}

}
