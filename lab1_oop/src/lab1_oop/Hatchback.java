package lab1_oop;

public class Hatchback extends Car {
	//hatchback car have 5 doors
	//hatchback avg lugage capacity 270 Lit
	public Hatchback (String brand, String model,String engineType, int enginePower, String tractionType, int price) {
		this.setBrand(brand);
		this.setModel(model);
		this.setEngineType(engineType);
		this.setDoors(5);
		this.setEnginePower(enginePower);
		this.setTractionType(tractionType);
		this.setLugageCapacity(270);
		this.setPrice(price);
	}
	
	//methods
	
	public void carEngineStart() {
		System.console().printf("Hatchback engine start");
	}
	
	
}
