package Garage;

public abstract class Vehicle {
	
	String make;
	String name;
	double engineSize;
	String numPlate;
	int wheels;
	boolean wheelDamage;
	boolean bodyDamage;

	public Vehicle(String make, String name, double engineSize, int wheels, String numPlate, boolean wheelDamage, boolean bodyDamage) {
		super();
		this.make = make;
		this.name = name;
		this.engineSize = engineSize;
		this.wheels = wheels;
		this.numPlate = numPlate;
		this.wheelDamage = wheelDamage;
		this.bodyDamage = bodyDamage;
	}
}
