package strings;
import java.util.Scanner;
public class PrintAllcharsInString {

	public static void PrintAllchars(String str) {
		for(int i = 0; i<str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		PrintAllchars(str);

	}

}
