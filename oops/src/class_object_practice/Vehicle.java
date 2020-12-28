package class_object_practice;

public abstract class Vehicle {
	private String color;
	protected int maxSpeed;
	
	public Vehicle() {
		System.out.println("Default constructor parent");
	} 
	
	// own constructor
//	public Vehicle(int maxSpeed) {
//		this.maxSpeed = maxSpeed;
//	}
	
	public abstract boolean isMotarized();
	
	// getter
	public String getColor() {
		return this.color;
	}
	
	// setter
	public void setColor(String color) {
		this.color = color;
	}
	
	public  void print() {
		System.out.println("color is " + color + " " + "maxSpeed " + maxSpeed + "Parent class");
	}
}
