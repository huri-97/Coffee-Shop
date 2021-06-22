package huri.karatay.coffee.shop.application.model;

import huri.karatay.coffee.shop.application.productDecorator.CoffeeDecorator;
import huri.karatay.coffee.shop.application.productDecorator.EspressoShot;
import huri.karatay.coffee.shop.application.productDecorator.MilkFoam;
import huri.karatay.coffee.shop.application.productDecorator.SteamedMilk;

public class Cappuccino extends Coffee{
	
	private final int cost = 12;

	public Cappuccino() {
		super.add((CoffeeDecorator) new EspressoShot(1));
		super.add((CoffeeDecorator) new SteamedMilk(2));
		super.add((CoffeeDecorator) new MilkFoam(2));
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
		return "Cappuchino";
	}

}
