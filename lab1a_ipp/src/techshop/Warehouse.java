package techshop;

import java.util.ArrayList;

public class Warehouse  {
	private long capacity = 8;
	private ArrayList<Order> orderArray = new ArrayList<Order>((int)capacity);
	private long stored = 0;
	private static Warehouse instance;
	
	public ArrayList<Order> getOrderArray() {
		return orderArray;
	}
	public void setOrderArray(ArrayList<Order> orderArray) {
		this.orderArray = orderArray;
	}
	
	public Boolean addItem (Order newItem) {
		if (!this.getOrderArray().isEmpty()) {
			if(this.getOrderArray().get((int) stored-1).equals(newItem)) {
				this.getOrderArray().add((int) stored,newItem);
				stored+=1;
				return true;
			}
		}
		else {
			this.getOrderArray().add((int) stored,newItem);
			stored+=1;
			return true;
		}
		return false;
		
	}
	
	public Order aquire(String lType) {
		for(Order ord: Warehouse.getInstance().getOrderArray()) {
			if(ord.getProduct().getLaptopType().toLowerCase().equals(lType.toLowerCase()))
				return ord;
		}
		return null;
	}
	
	public Boolean release(Order oldItem) {
		if(this.getOrderArray().remove(oldItem))
			return true;
		return false;	
	}
	
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public static Warehouse getInstance() {
		if(instance == null) 
			instance = new Warehouse();
		return instance;
	}
	public void setInstance(Warehouse instance) {
		Warehouse.instance = instance;
	}
	
	public Boolean ckAvailable(String laptopType) {
		Boolean tmp = false;
		for(Order a: orderArray) {
			if(a.getProduct().getLaptopType().toLowerCase().equals(laptopType.toLowerCase()))
				tmp = true;
		}
		return tmp;
	}
}
