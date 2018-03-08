package Garage;

import java.util.ArrayList;

public class Garage {
	
	ArrayList<Vehicle> garage = new ArrayList<Vehicle>();

	public Garage() {
		
	}

	public void addVehicle(Vehicle name) {
		garage.add(name);
		System.out.println(name.make + " " + name.name + " has been added to the garage");
	}
	
	public void remVehicle(Vehicle name) {
		garage.remove(name);
		System.out.println(name.make + name.name + " has been removed from the garage");
	}
	
	public void fixVehicle(Vehicle name) {
		name.bodyDamage = false;
		name.wheelDamage = false;
	}
	
	public void emptyGarage() {
		garage.clear();
	}
	
	public String printInventory() {
		String currentInventory = "";
		for (int i = 0; i < garage.size(); i++) {
			currentInventory = currentInventory + garage.get(i).toString();
			System.out.println(currentInventory);
			System.out.println(calcBill(garage.get(i)));
			System.out.println("");
			currentInventory = "";
		}
		return currentInventory;
	}
	
	public String calcBill(Vehicle name) {
		
		int sum = 0;
		
		switch (name.getClass().getSimpleName()) {
		case "Car":
			if (name.bodyDamage == true) {
				sum += 750;
			} else if (name.wheelDamage == true) {
				sum += 200;
			}
			break;
		case "Motorcycle":
			if (name.bodyDamage == true) {
				sum += 500;
			} else if (name.wheelDamage == true) {
				sum += 100;
			}
			break;
		case "Vans":
			if (name.bodyDamage == true) {
				sum += 1500;
			} else if (name.wheelDamage == true) {
				sum += 400;
			}
			break;
		}
		
		return "Total bill for the Vehicle " + name.make + " " + name.name + " is £" + sum;
	}
}
