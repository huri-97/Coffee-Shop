package huri.karatay.coffee.shop.application.model;
import java.util.ArrayList;
import java.util.List;

import huri.karatay.coffee.shop.application.productDecorator.CoffeeDecorator;
import huri.karatay.coffee.shop.application.productDecorator.EspressoShot;

public abstract class Coffee {
	private List<CoffeeDecorator> coffeeDecorators;

	public Coffee() {
		super();
		this.coffeeDecorators = new ArrayList<>();
	}
	
	
	public void add(CoffeeDecorator coffeeDecorator) {
		coffeeDecorators.add(coffeeDecorator);
	}
	
	public List<CoffeeDecorator> getCoffeeDecorator() {
		return coffeeDecorators;
	}

	public void setCoffeeDecorator(List<CoffeeDecorator> coffeeDecorator) {
		this.coffeeDecorators = coffeeDecorator;
	}
	
	abstract int getCost();
	abstract String prepare();

}
