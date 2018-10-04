package techshop;

import java.util.Scanner;

public class TechShop implements ITechShop,LastProductRequest,SameProductRequest {
	private static Order newOrder = new Order();
	private static Order lastOrder = null;
	private static Manager laptop;
	private static Warehouse wHouse = Warehouse.getInstance();
	private static Scanner scan;
	
	public static void main (String argv[]) {
		while(true) {
		System.out.print("\n\nWelcome to the TECHSHOP!!!\n");
		
		newPurchase();
		}
	}
	
	
	public static Boolean compareWithLastProduct(Order lastOrder,String laptopType) {
		if(lastOrder.getProduct().getLaptopType().equalsIgnoreCase(laptopType)) {
			return true;
		}
		return false;
	}

	
	public static Order cloneLastOrder(String cliName) {
		newOrder = getLastOrder();
		getNewOrder().setClientName(cliName);
		return getNewOrder();
	}

	public static Order getNewOrder() {
		return newOrder;
	}


	public static Order getLastOrder() {
		return lastOrder;
	}
	
	public static String basicOrAdvanced(String baseType) {
		Scanner scan = new Scanner(System.in);
		
		
		while(true) {
			System.out.print("\n1.Basic\n2.Advanced\nChoose build: \n");
			int subType = scan.nextInt();
			switch(subType) {
			case 1:
				return "basic"+baseType;
			case 2:
				return "advanced"+baseType;
				default:
					System.out.println("Wrong! Try again!");
				
			}
		}
		
	}
	
	public static void newPurchase() {
		scan = new Scanner(System.in);
		System.out.println("Client name: \n");
		String cliName = scan.nextLine();
		//System.out.println("Laptop type: ");
		String laptopType = "";//= scan.nextLine();
		String baseType;
		while(true) {
			System.out.print("\n1.Notebook\n2.Netbook\n3.Gamebook\n4.Ultrabook\n5.Custom\nChoose your type: \n");
			int mType = scan.nextInt();
			switch (mType) {
			case 1:
				baseType = "Notebook";
				laptopType = basicOrAdvanced(baseType);
				break;
			case 2:
				baseType = "Netbook";
				laptopType = basicOrAdvanced(baseType);
				break;
			case 3:
				baseType = "Gamebook";
				laptopType = basicOrAdvanced(baseType);
				break;
			case 4:
				baseType = "Ultrabook";
				laptopType = basicOrAdvanced(baseType);
				break;
			case 5:
				laptopType = "custom";
				break;
				default:
					System.out.println("Wrong! Try again!");
			
			}
			if(!laptopType.equals(""))
				break;
		}
		if(lastOrder == null) {
			laptop = new Manager(laptopType);
			newOrder = getNewOrder().newOrder(cliName,laptop);
			lastOrder = getNewOrder();
			wHouse.getInstance().addItem(getNewOrder());
		}
		
		else if(compareWithLastProduct(lastOrder, laptopType)) {
			newOrder = cloneLastOrder(cliName);
			lastOrder = getNewOrder();
			wHouse.getInstance().addItem(getNewOrder());
		}
		
		else if(wHouse.getInstance().ckAvailable(laptopType)) { 
			newOrder = wHouse.aquire(laptopType);
			lastOrder = getNewOrder();
		}
			
		else {
			laptop = new Manager(laptopType);
			newOrder = getNewOrder().newOrder(cliName,laptop);
			lastOrder = getNewOrder();
			wHouse.getInstance().addItem(getNewOrder());
		}
		
		if(getNewOrder() != null) {
			System.out.println("\n"+getNewOrder().getClientName());
			getNewOrder().getProduct().showLaptopData();
		}

	}
}
