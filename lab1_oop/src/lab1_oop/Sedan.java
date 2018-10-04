package lab1_oop;

public class Sedan extends Car {
	//sedan car have 5 doors
	//sedan avg lugage capacity 450 Lit
	public Sedan(String brand, String model,String engineType, int enginePower, String tractionType, int price) {
		this.setBrand(brand);
		this.setModel(model);
		this.setEngineType(engineType);
		this.setDoors(5);
		this.setEnginePower(enginePower);
		this.setTractionType(tractionType);
		this.setLugageCapacity(450);
		this.setPrice(price);
	}
	
	//methods
	
	public void carEngineStart() {
		System.console().printf("Sedan engine start");
	}
	
	
}
