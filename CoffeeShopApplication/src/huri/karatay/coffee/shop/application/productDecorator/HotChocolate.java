package huri.karatay.coffee.shop.application.productDecorator;

public class HotChocolate implements CoffeeDecorator {

	private final int dose;
	
	public HotChocolate(int dose) {
		this.dose = dose;
	}
	
	@Override
	public String add() {
		String info = this.dose + " dose hot chocolate";
		return info;

		
	}

}
