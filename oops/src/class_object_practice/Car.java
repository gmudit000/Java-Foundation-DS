package class_object_practice;

public class Car extends Vehicle {
	int numDoors;
	
	public Car() {
//		super(100);
		System.out.println("Default constructor child");

	}
	
	@Override
	public boolean isMotarized() {
		return false;
	}
	
	public void display() {
		System.out.println("jell");
	}
	
	public void print(int age) {
//		super.print();
//		System.out.println("color is " + this.getColor() + " " + "maxSpeed " + maxSpeed + "child class");
		System.out.println("hekkkko pepefrivnirmopm");
	}
}
