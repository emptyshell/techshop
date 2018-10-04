package lab1_oop;

public class Car {
	private String brand;
	private String model;
	private String engineType;
	private int doors;
	private int enginePower;
	private String tractionType;
	private int lugageCapacity;
	private int gear = 0;
	private int price;
	
	//setters
	public void setBrand (String brand) {
		this.brand = brand;
	}
	
	public void setModel (String model) {
		this.model = model;
	}
	
	public void setEngineType (String engineType) {
		this.engineType = engineType;
	}
	
	public void setDoors(Integer doors) {
		this.doors = doors;
	}

	public void setEnginePower(Integer enginePower) {
		this.enginePower = enginePower;
	}

	public void setTractionType(String tractionType) {
		this.tractionType = tractionType;
	}

	public void setLugageCapacity(Integer lugageCapacity) {
		this.lugageCapacity = lugageCapacity;
	}
	
	public void setGear(int gear) {
		this.gear = gear;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	//getters
	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public String getEngineType() {
		return engineType;
	}
	
	public int getDoors() {
		return doors;
	}

	public int getEnginePower() {
		return enginePower;
	}

	public String getTractionType() {
		return tractionType;
	}
	
	public int getLugageCapacity() {
		return lugageCapacity;
	}
	
	public int getGear() {
		return gear;
	}
	
	public int getPrice() {
		return price;
	}
	
	//constructor
	public Car() {
		this.setBrand("");
		this.setModel("");
		this.setEngineType("");
		this.setDoors(0);
		this.setEnginePower(0);
		this.setTractionType("");
		this.setLugageCapacity(0);
		this.setGear(0);
		this.setPrice(0);
	}
	
	public Car(String brand, String model,String engineType, int doors, int enginePower, String tractionType, int lugageCapacity) {
		this.setBrand(brand);
		this.setModel(model);
		this.setEngineType(engineType);
		this.setDoors(doors);
		this.setEnginePower(enginePower);
		this.setTractionType(tractionType);
		this.setLugageCapacity(lugageCapacity);
		this.setGear(0);
		this.setPrice(0);
	}
	
	
	//methods
	
	public void carEngineStart() {
		System.console().printf("Engine start");
	}
	
	public int carGearShiftUp (int currentGear) {
		currentGear = getGear();
		return currentGear++;
	}
	
	public int carGearShiftDown (int currentGear) {
		currentGear = getGear();
		return currentGear--;
	}
	
	public void showAllCaracteristics() {
		
		System.out.printf("Brand: %s \n", this.getBrand());
		System.out.printf("Model: %s \n", this.getModel());
		System.out.printf("Engine type: %s \n", this.getEngineType());
		System.out.printf("Doors: %d \n", this.getDoors());
		System.out.printf("Engine power: %d HP \n", this.getEnginePower());
		System.out.printf("Traction type: %s \n", this.getTractionType());
		System.out.printf("Lugage capacity: %d Lit \n", this.getLugageCapacity());
		System.out.printf("Price: %d $ \n", this.getPrice());
		System.out.println("------------------------------------------------------------------------------");
		
	}
	
}
