package huri.karatay.coffee.shop.application.model;

public class CoffeeFactory {
	
	   public Coffee createCoffee(CoffeeType type) {
	        Coffee coffee = null;

	        switch (type) {
	            case AMERICANO:
	                coffee = new Americano();
	                break;
	            case ESPRESSO:
	                coffee = new Espresso();
	                break;
	            case CAPPUCCINO:
	                coffee = new Cappuccino();
	                break;
	            case CAFFE_LATTE:
	                coffee = new CaffeLatte();
	                break;
	            case MOCHA:
	            	coffee = new Mocha();
	            	break;
	            case DOPPIO:
	            	coffee = new Doppio();
	            	break;
	        }

	        return coffee;
	    }

}
