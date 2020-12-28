package strings;

public class StringReverseWordwise {

	public static String ReverseWordwise(String str) {
		String ans = "";
		
		int startposition = 0;
		int i = 0;
		for(; i<str.length() ; i++) {
			if(str.charAt(i) == ' ') {
				int endposition= i-1;
				String word = "";
				
				for(int j = startposition; j<=endposition ; j++) {
					word += str.charAt(j);
				}
				ans = word + " " + ans;
				startposition = i+1;
			}
		}
		
		int endposition= i-1;
		String word = "";
		
		for(int j = startposition; j<=endposition ; j++) {
			word += str.charAt(j);
		}
		ans = word + " " + ans;
		
		return ans;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Welcome to coding ninjas";
		String ans = ReverseWordwise(str);
		System.out.println(ans);
	}

}
