package huri.karatay.coffee.shop.application;

import java.util.Scanner;

import huri.karatay.coffee.shop.application.model.Americano;
import huri.karatay.coffee.shop.application.model.CaffeLatte;
import huri.karatay.coffee.shop.application.model.Cappuccino;
import huri.karatay.coffee.shop.application.model.Coffee;
import huri.karatay.coffee.shop.application.model.CoffeeFactory;
import huri.karatay.coffee.shop.application.model.CoffeeType;
import huri.karatay.coffee.shop.application.model.Doppio;
import huri.karatay.coffee.shop.application.model.Espresso;
import huri.karatay.coffee.shop.application.model.HotWater;
import huri.karatay.coffee.shop.application.model.Mocha;

public class CoffeeShop {
	
	private final CoffeeFactory coffeeFactory = new CoffeeFactory();
    
    public Coffee orderCoffee(CoffeeType type) {
        Coffee coffee = coffeeFactory.createCoffee(type);
		return coffee; 
    }

	public void start() {
		
		int choice;
		while (true) {

			// First requirement
			String orderList = "1. Espresso (7 $)\n" + "2. Double Espresso (12 $)\n" + "3. Cappuccino (12 $)\n"
					+ "4. Caffe Latte (12 $)\n" + "5. Mocha (13 $)\n" + "6. Americano (10 $)\n"
					+ "7. Hot Water (3 $)\n"
					+ "8. Exit\n";

			System.out.print(orderList);
			Scanner scan = new Scanner(System.in);
			System.out.print("Please enter the number of the coffee you want to drink: ");
			choice = scan.nextInt();

			
			if(choice <1 || choice >8) {
				System.out.println("You entered invalid number :( \n");
				continue;
			}else {
				if(choice == 8) {
					System.out.println("Good bye :)");
					System.exit(0);
				}
				// Second requirement
				System.out.println("Thanks. Your drink is being prepared. ");
				//ThirdRequirement
				CoffeeType coffeeType = specifyType(choice);
				Coffee coffee = orderCoffee(coffeeType);
				String info = coffee.prepare();
				System.out.println(coffee.toString()+ " is selected. This beverage contains "+ info + ". Bon appetit :) ");
			}
	
		}
		
	}
	
	public CoffeeType specifyType(int choice) {
		CoffeeType coffee = null;
		switch(choice) {
			case 1:
				coffee = CoffeeType.ESPRESSO;
				break;
			case 2: 
				coffee = CoffeeType.DOPPIO;
				break;
			case 3:
				coffee = CoffeeType.CAPPUCCINO;
				break;
			case 4: 
				coffee = CoffeeType.CAFFE_LATTE;
				break;
			case 5:
				coffee = CoffeeType.MOCHA;
				break;
			case 6: 
				coffee = CoffeeType.AMERICANO;
				break;
			case 7: 
				coffee = CoffeeType.HOTWATER;
				break;
			default:
				System.out.println("Wrong choice");
				break;
		}
		return coffee;
		
	}

}
