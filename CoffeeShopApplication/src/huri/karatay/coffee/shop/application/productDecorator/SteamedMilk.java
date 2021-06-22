package huri.karatay.coffee.shop.application.productDecorator;

public class SteamedMilk implements CoffeeDecorator{
	
	private final int dose;
	
	public SteamedMilk(int dose) {
		this.dose = dose;
	}

	@Override
	public String add() {
		String info = this.dose + " dose streamed milk";
		return info;

	}

}
