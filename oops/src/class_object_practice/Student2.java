package class_object_practice;

public class Student2 {
	String name;
	int rollNo;
	double cgpa;
	static final double CONVERSION_FACTOR = 0.95;
	static int numStudents;
	
	
	// static function
	public static int getnumStudent() {
		return numStudents;
	}
	
	public Student2(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
		numStudents++;
	}
}
