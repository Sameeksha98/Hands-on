package solidPrinciple;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to our site. Would you like to order or repair.");
		Scanner sc= new Scanner(System.in);
		
		String choice = sc.next();
		switch(choice) {
		case "order": System.out.println("Enter the phone model name");
						String orderName = sc.next();
						Ordering order = new Ordering();
						order.ProcessOrder(orderName);
						break;
						
		case "repair": System.out.println("Is it phone or accessory to be repaired");
						String productType = sc.next();
						if(productType.equalsIgnoreCase("phone")) {
							System.out.println("Please provide the phone model name");
							String modelName = sc.next();
							PhoneRepairing phone = new PhoneRepairing();
							phone.ProcessPhoneRepair(modelName);
						}
						else {
							System.out.println("Please provide the accessory like headphone, tempered glass");
							String accessoryType = sc.next();
							AccessoryRepairing phone = new AccessoryRepairing();
							phone.ProcessAccessoryRepair(accessoryType);
						}
						break;
		default : break;
		}
	}

}
