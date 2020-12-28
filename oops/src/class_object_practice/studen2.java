package class_object_practice;

public class studen2 {
	
	public String name;
	private int rollno;
	final double conversionFactor = 0.95;
	int numStudent;
	
	// getter and setter
	public int getRollNo() {
		return this.rollno;
	}
	
	public void setRollNO(int rollno) {
		if(rollno <=0){
			return;
		}
		this.rollno = rollno;
	}
	
	// own constructor
	public studen2() {
		
	}

}
