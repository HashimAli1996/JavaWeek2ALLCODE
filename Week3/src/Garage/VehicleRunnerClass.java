package Garage;

public class VehicleRunnerClass {

	public static void main(String[] args) {
		
		Garage HashGarage = new Garage();
		
		Car volvo = new Car("Volvo", "V50", 2.0, 4, "plate1", true, false, 5, false, true);
		Car volkswagen = new Car("Volkswagen", "Polo", 1.2, 4, "plate2", true, true, 5, false, false);
		Car nissan = new Car("Nissan", "Micra", 1.0, 4, "plate3", true, false, 5, false, false);
		
		Motorcycle fastOne = new Motorcycle("Suzuki", "F$T", 1.3, 2, "F445T", false, true, 99, false);
		Motorcycle toyota = new Motorcycle("Toyota", "Moped", 1.3, 2, "F445T", true, true, 99, true);
		
		Vans bigVan = new Vans("big make", "ur dad", 99.0, 50, "B1G D4DDY", true, true, false, 3000);
		
		HashGarage.addVehicle(nissan);
		HashGarage.addVehicle(volkswagen);
		HashGarage.addVehicle(volvo);
		
		HashGarage.addVehicle(fastOne);
		HashGarage.addVehicle(toyota);
		
		HashGarage.addVehicle(bigVan);
		
		System.out.println("");
		
		HashGarage.printInventory();
		
		
		//System.out.println(HashGarage.calcBill(volvo));
	}
}
