package class_object_practice;

public class Bicycle extends Vehicle{
	
	public Bicycle() {
//		super(40);
		System.out.println("Default constructor child");

	}
//	public void print() {
//		System.out.println("color is " + this.getColor() + " " + "maxSpeed " + maxSpeed + "child class");
//	}
	
	@Override
	public boolean isMotarized() {
		// TODO Auto-generated method stub
		return false;
	}

}
