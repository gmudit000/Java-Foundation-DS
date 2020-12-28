package recursion_ques;

public class CheckPalindrome {

	public static boolean checkit(String input, int si, int ei) {
		if(si >= ei) {
			return true;
		}
		
		if(input.charAt(si) != input.charAt(ei)) {
			return false;
		}
		
		boolean status =  checkit(input,si+1,ei-1);
		return status;
	}
	
	public static void main(String[] args) {
		String str = "raceecar";
		int len = str.length();
		System.out.println(checkit(str,0,len-1));
	}

}
