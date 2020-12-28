package classesandobjects;

public class StuFinalStatic {
	String name;
	int rollNo;
	double cgpa;
	final static double CONVERSION_FACTOR = 0.95;
	private static int numStudent;
	
	
	public StuFinalStatic(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
		numStudent++;
	}
	
	public static int getNumStudent() {
		
		// non static variable cannot be used in static function
//		System.out.println(rollNo);
		return numStudent;
	}
	
	
}

