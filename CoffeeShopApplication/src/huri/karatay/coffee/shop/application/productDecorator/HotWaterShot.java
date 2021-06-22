package huri.karatay.coffee.shop.application.productDecorator;

public class HotWaterShot implements CoffeeDecorator {
	private final int dose;
	
	public HotWaterShot(int dose) {
		this.dose = dose;
	}

	@Override
	public String add() {
		String info = this.dose + " dose hot water";
		return info;
		
	}

}
