package strings;
import java.util.Scanner;
public class PalindromeCheck {

	public static boolean palindromeCheckit(String str) {
		String rev = "";
		for(int i = str.length()-1; i>= 0; i--) {
			rev = rev + str.charAt(i);
		}
		
		if(rev.equals(str)) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String str = s.next();
		boolean check = palindromeCheckit(str);
		System.out.println(check);
	}

}
