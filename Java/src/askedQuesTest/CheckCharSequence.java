package askedQuesTest;
import java.util.Scanner;
public class CheckCharSequence {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// total num of elements
		int n = s.nextInt();
		
		int pre = s.nextInt();
		boolean isDec =true;
		boolean isValid = true;

		int i = 1;
		while(i < n) {
			int cur = s.nextInt();
			if(cur == pre) {
				isValid = false;
			}else if(cur > pre){   // incresing
				isDec = false;
			}else if(cur < pre) {  // decreasing
				if(isDec == false) {
					isValid = false;
				}
			}else {
				isValid = true;
			}
			pre = cur;
			i++;
		}
		System.out.println(isValid);
	}
}