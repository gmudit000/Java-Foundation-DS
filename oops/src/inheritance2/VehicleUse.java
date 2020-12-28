package inheritance2;

public class VehicleUse {
	public static void main(String[] args) {
			
	//		Vehicle v = new Vehicle();
	//		v.maxSpeed = 100;
	//		v.setColor("pink");
	//		v.print();
			
			Vehicle v = new Car();
			
			// Object is super class of all classes in java
			Object o = new Vehicle();
			Object f = new Car();
			
			
	//		v = new Bicycle();
			Car c = (Car)v;		// class cast
			c.numDoors = 9;
			
			
			Car d = new Car();
	//		d.setColor("black");
	//		d.color = "pink";
	//		d.maxSpeed = 910;
	//		d.numDoors = 4;
	//		d.print();
			
	//		Bicycle b = new Bicycle();
	//		b.setColor("blue");
	//		b.maxSpeed = 90;
	//		b.print();
			
	
		}

}
