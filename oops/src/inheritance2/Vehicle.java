package inheritance2;

public class Vehicle {
	//private members
	private String color;
	protected int maxSpeed;
	
	//default constructor
	public Vehicle() {
		
	}
	
	// own constructor
		public Vehicle(int maxSpeed) {
			System.out.println("Vehicle constructor");
			this.maxSpeed = maxSpeed;
		}
	
	// getter and setter
	public String getColor() {
		return this.color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void print() {
		System.out.println("Vehicle color " + color + " maxSpeed " + maxSpeed);
	}
}
