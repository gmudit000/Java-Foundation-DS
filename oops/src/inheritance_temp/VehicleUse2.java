package inheritance_temp;

import inheritance2.Vehicle;

public class VehicleUse2 {

	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		
		
		// maxSpeed(protected modifier) is not accessible here bcoz... VehicleUse2 is not derived class or not within same package
//		v.maxSpeed

	}

}
