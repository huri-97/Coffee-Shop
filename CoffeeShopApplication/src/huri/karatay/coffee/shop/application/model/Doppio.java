package huri.karatay.coffee.shop.application.model;
import java.util.ArrayList;
import java.util.List;

import huri.karatay.coffee.shop.application.productDecorator.EspressoShot;
import huri.karatay.coffee.shop.application.productDecorator.CoffeeDecorator;

public class Doppio extends Coffee{
	private final int cost = 12;

	public Doppio() {
		super.add((CoffeeDecorator) new EspressoShot(2));
	}

	@Override
	public int getCost() {
		return this.cost;
	}

	@Override
	public String prepare() {
		String info ="";
		int count=1;
		for(CoffeeDecorator cd:super.getCoffeeDecorator()) {	
			if(count>1) {
				info+=" and ";
			}
			info+=cd.add();
			count+=1;
			
		}
		return info;
		
		
	}

	@Override
	public String toString() {
		return "Double Espresso";
	}

}
