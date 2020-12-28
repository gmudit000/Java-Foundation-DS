package askedQuesTest;

public class Common_charINString {

	public static void main(String[] args) {
		
		String s1 = "MUDIT";
		String s2 = "MUD";
		int count = 0;
		
			for(int i = 0; i<s1.length();i++) {
				for(int j = 0; j<s2.length();j++) {

				char c1 = s1.charAt(i);
				char c2 = s2.charAt(j);
				
					if(c1 == c2) {
						count+=1;
						break;
					}
				}				
			}
		System.out.println(count);
	}
}