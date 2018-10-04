package lab1_oop;

public class Supercar extends Car {
	//supercar car have 3 doors
	//supercar avg lugage capacity 150 Lit
	//avg enginepower 850 hp
	public Supercar (String brand, String model,String engineType, String tractionType, int price) {
		this.setBrand(brand);
		this.setModel(model);
		this.setEngineType(engineType);
		this.setDoors(3);
		this.setEnginePower(850);
		this.setTractionType(tractionType);
		this.setLugageCapacity(150);
		this.setPrice(price);
	}
	
	//methods
	
	public void carEngineStart() {
		System.console().printf("Supercar engine start");
	}
	
	public int sportMode () {
		return getEnginePower()+150;
	}
	
	
}
