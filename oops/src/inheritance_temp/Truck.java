package inheritance_temp;

import inheritance2.Vehicle;

public class Truck extends Vehicle {
	int maxLoadingCapacity;
	
	public void print() {
		System.out.println("Vehicle color " + getColor() + " maxSpeed " + maxSpeed + "maxLoading" + maxLoadingCapacity);
	}
}
