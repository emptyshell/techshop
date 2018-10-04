package lab1_oop;

import java.util.Scanner;

public class Dealer {

	
	private static Scanner sc;

	public static void main(String[] args) {
		
	  Sedan sedan = new Sedan("BMW","320d","4-inline",150,"rear",6000);
	  Sedan sedan1 = new Sedan("BMW","520d","4-inline",180,"rear",8000);
	  Coupe coupe = new Coupe("BMW","320","4-inline",150,"rear",5500);
	  Coupe coupe1 = new Coupe("Honda","Civic","4-inline",150,"front",7500);
	  Hatchback hatchback = new Hatchback("Volkswagen","golf5","4-inline",120,"front",10500);
	  Hatchback hatchback1 = new Hatchback("Toyota","Corola","4-inline",108,"front",4500);
	  Van van = new Van ("Mercedes","Sprinter","4-inline",119,"4x4",7500);
	  Van van1 = new Van ("Honda","odyssey","4-inline",109,"front",12000);
	  Supercar supercar = new Supercar ("Audi","R8","v10","rear",140000);
	  sc = new Scanner(System.in);
	  System.out.println("1");
	  sedan1.showAllCaracteristics();
	  System.out.println("2");
	  coupe.showAllCaracteristics();
	  System.out.println("3");
	  coupe1.showAllCaracteristics();
	  System.out.println("4");
	  hatchback.showAllCaracteristics();
	  System.out.println("5");
	  hatchback1.showAllCaracteristics();
	  System.out.println("6");
	  van.showAllCaracteristics();
	  System.out.println("7");
	  van1.showAllCaracteristics();
	  System.out.println("8");
	  supercar.showAllCaracteristics();
	  System.out.println("9");
	  sedan.showAllCaracteristics();
	  
	  System.out.println("Witch car would you like to buy?");
	  switch (sc.nextInt()) {
	  case 1:
		  System.out.println("Congratulations! This is your new car: ");
		  sedan1.showAllCaracteristics();
		  break;
	  case 2:
		  System.out.println("Congratulations! This is your new car: ");
		  coupe.showAllCaracteristics();
		  break;
	  case 3:
		  System.out.println("Congratulations! This is your new car: ");
		  coupe1.showAllCaracteristics();
		  break;
	  case 4:
		  System.out.println("Congratulations! This is your new car: ");
		  hatchback.showAllCaracteristics();
		  break;
	  case 5:
		  System.out.println("Congratulations! This is your new car: ");
		  hatchback1.showAllCaracteristics();
		  break;
	  case 6:
		  System.out.println("Congratulations! This is your new car: ");
		  van.showAllCaracteristics();
		  break;
	  case 7:
		  System.out.println("Congratulations! This is your new car: ");
		  van1.showAllCaracteristics();
		  break;
	  case 8:
		  System.out.println("Congratulations! This is your new car: ");
		  supercar.showAllCaracteristics();
		  break;
	  case 9:
		  System.out.println("Congratulations! This is your new car: ");
		  sedan.showAllCaracteristics();
		  break;
	  default:
		  System.out.println("Wrong choise!");
	  }
	  
	  
		
	}
	
	
}
