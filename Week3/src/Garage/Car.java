package Garage;

public class Car extends Vehicle {

	int seats;
	boolean tintWindows;
	boolean isRemapped;
	
	public Car(String make, String name, double engineSize, int wheels, String numPlate, boolean wheelDamage, boolean bodyDamage, int seats, boolean tintWindows, boolean isRemapped) {
		super(make, name, engineSize, wheels, numPlate, wheelDamage, bodyDamage);
		this.seats = seats;
		this.tintWindows = tintWindows;
		this.isRemapped = isRemapped;
	}

	@Override
	public String toString() {
		return  "Car: make = " + make + "Car seats = " + seats + ", tintWindows = " + tintWindows + ", isRemapped = " + isRemapped +
				", name = " + name + ", engineSize = " + engineSize + ", numPlate = " + numPlate + ", wheels = " + wheels
				+ ", wheelDamage = " + wheelDamage + ", bodyDamage = " + bodyDamage + "";
	}
	
	
}
