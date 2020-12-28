package function;

public class TestRun {

//	public static void series(int start, int end) {
//		for(int i = start ; i<= end; i++) {
//			if(i%2 == 0) {
//				System.out.println(i);
//				// return i  wrong hai yeh 
//			}
//		}
//	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		series(13,20);
//
//	}

	
	public static double add(int a,int b)
	{
	    double c=a+b;
	    return c;
	}
	public static void main (String[] args) {
	    float ans = (float)add(10,3);
	    System.out.println(ans);
	    
	}
}
