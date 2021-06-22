package huri.karatay.coffee.shop.application;

import java.util.Scanner;

public class Order {
	
	
	public void start() {
		String orderList = "1. Espresso (7 $)\n"
				+ "2. Double Espresso (12 $)\n"
				+ "3. Cappuccino (12 $)\n"
				+ "4. Caffe Latte (12 $)\n"
				+ "5. Mocha (13 $)\n"
				+ "6. Americano (10 $)\n"
				+ "7. Hot Water (3 $)\n";
		
		System.out.print(orderList);
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter the number of the coffee you want to drink: ");
		int choice = scan.nextInt();
		
		
		
	}

}
