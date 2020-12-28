package classesandobjects;

// Getter and Setter
// this keyword
public class Student2 {
	
	private String name;
	private int rollNumber;

	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		int count = 0;
		for(int i = 0 ;i < name.length() ; i++) {
			
			// checking for special character
			if(name.charAt(i) >= 32 && name.charAt(i) <= 64) {
				count++;
			}
		}
		if(count == 0) {
			this.name = name;
		}
	}
	
	
	public int getRollNo() {
		return this.rollNumber;
	}
	
	public void setRollNo(int rollNumber) {
		if(rollNumber <=0) {
			return;
		}
		System.out.println("this reference " + this);
		this.rollNumber = rollNumber;
	}
}
