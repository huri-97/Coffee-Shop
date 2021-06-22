package huri.karatay.coffee.shop.application.model;

import huri.karatay.coffee.shop.application.productDecorator.CoffeeDecorator;
import huri.karatay.coffee.shop.application.productDecorator.HotWaterShot;

public class HotWater extends Coffee{

	private final int cost = 3;

	public HotWater() {
		super.add((CoffeeDecorator) new HotWaterShot(5));
	}
	
	@Override
	int getCost() {
		return this.cost;
	}

	@Override
	String prepare() {
		String info ="";
		int count=1;
		for(CoffeeDecorator cd:super.getCoffeeDecorator()) {	
			if(count>1) {
				info+=" and";
			}
			info+=cd.add();
			count+=1;
			
		}
		return info;
	}
	
	
	
	

}
