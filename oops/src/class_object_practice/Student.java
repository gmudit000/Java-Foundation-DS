package class_object_practice;

public class Student {
	String name;
	private int rollNo;
	final double conversionFactor = 0.95;
	
	// default constructor
//	public Student() {
//		
//	}
	
	// own constructor
	public Student(String name, int n) {
		this.name = name;
		this.rollNo = n;
	}
	
	//getter
	public int getRollNo(){
		return rollNo;
	}
	
	//setter
	public void setRollNo(int rollNo) {
		if(this.rollNo <=0 ) {
			return;
		}
		this.rollNo = rollNo;
	}
}
