package huri.karatay.coffee.shop.application.productDecorator;

public class MilkFoam implements CoffeeDecorator{
	
	private final int dose;
	
	public MilkFoam(int dose) {
		this.dose = dose;
		
	}

	@Override
	public String add() {
		String info = this.dose + " dose milk foam";
		return info;
		
	}

}
