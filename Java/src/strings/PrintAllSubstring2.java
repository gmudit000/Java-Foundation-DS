package strings;

public class PrintAllSubstring2 {

	public static void main(String[] args) {
		
		String str= "pqrst";
		int len = str.length();
		int count = 0;
		
		for(int i = 1; i <=str.length(); i++) {
			for(int start = 0, end = start+i-1;start<=end;start++) {
				System.out.println(str.substring(start,end+1));
				count++;
			}
		}
		System.out.println("count is: " + count);

	}

}