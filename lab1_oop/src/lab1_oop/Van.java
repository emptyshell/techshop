package lab1_oop;

public class Van extends Car {
	//van avg lugage capacity 1500 Lit
	public Van (String brand, String model,String engineType, Integer enginePower, String tractionType, int price) {
		this.setBrand(brand);
		this.setModel(model);
		this.setEngineType(engineType);
		this.setDoors(5);
		this.setEnginePower(enginePower);
		this.setTractionType(tractionType);
		this.setLugageCapacity(1500);
		this.setPrice(price);
	}
	
	//methods
	
	public void carEngineStart() {
		System.console().printf("Van engine start");
	}
	
	
}
