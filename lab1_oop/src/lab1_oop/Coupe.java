package lab1_oop;

public class Coupe extends Car {
	//coupe car have 3 doors
	//coupe avg lugage capacity 450 Lit
	public Coupe (String brand, String model,String engineType, Integer enginePower, String tractionType, int price) {
		this.setBrand(brand);
		this.setModel(model);
		this.setEngineType(engineType);
		this.setDoors(3);
		this.setEnginePower(enginePower);
		this.setTractionType(tractionType);
		this.setLugageCapacity(450);
		this.setPrice(price);
	}
	
	//methods
	
	public void carEngineStart() {
		System.console().printf("Coupe engine start");
	}
	
	
}
