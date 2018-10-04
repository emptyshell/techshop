package techshop;


import laptop.Laptop;

public class Order {
	private String clientName;
	private Laptop product;
	
	//getters and setters
	public String getClientName() {
		return clientName;
	}
	
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	
	public Laptop getProduct() {
		return product;
	}
	
	public void setProduct(Laptop product) {
		this.product = product;
	}
	
	public Order newOrder(String clientName, Manager laptop) {
		
		Order order = new Order();
		order.setClientName(clientName);
		order.setProduct(laptop.getLaptop());
		return order;
		
	}
	
}
