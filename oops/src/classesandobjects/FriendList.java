package classesandobjects;

public class FriendList {
	
	String name;
	int phoneNo;
	int cgpa;
	// final keyword
	final double conversion_factor = 9.5;
	
// 	default constructor
//	public FriendList() {
	              //or set up some default values in it
//	}
	
	public FriendList(String name, int phoneNo) {
		this.name = name;
		this.phoneNo = phoneNo;
	}
	
	public FriendList(String name) {
		this.name = name;
	}
	
	public void print() {
		System.out.println(this.name + " " + this.phoneNo);
	}
}