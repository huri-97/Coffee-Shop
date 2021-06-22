package huri.karatay.coffee.shop.application.productDecorator;

public class EspressoShot implements CoffeeDecorator{
	
	private final int dose;
	
	public EspressoShot(int dose) {
		this.dose = dose;
	}

	@Override
	public String add() {
		
		String info = this.dose + " dose espresso";
		return info;
		
	}

}
