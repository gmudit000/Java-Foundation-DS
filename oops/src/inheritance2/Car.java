package inheritance2;

public class Car extends Vehicle{

	int numDoors;
	int maxSpeed;
	
	// default constructor
	public Car() {
		super(100);
		System.out.println("car constructor");
	}
	
	public void print() {
		
		// super refer to parent class object
		super.print();
		System.out.println("car numDoors " + numDoors);
	}
}
