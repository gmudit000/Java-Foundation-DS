package class_object_practice;

public class VehicleUse {
	public static void main(String[] args) {
		
	
		Car c = new Car();
		
//		c.color = "abc";
		c.setColor("pink");
		c.maxSpeed = 150;
		c.numDoors = 4;
		c.print();
		
		Bicycle b = new Bicycle();
		b.maxSpeed = 12;
//		b.color = "yellow";
		b.setColor("blue");
		b.print();
	}
}
