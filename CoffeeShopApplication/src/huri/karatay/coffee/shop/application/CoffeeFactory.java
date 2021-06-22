package huri.karatay.coffee.shop.application;

import huri.karatay.coffee.shop.application.model.Americano;
import huri.karatay.coffee.shop.application.model.CaffeLatte;
import huri.karatay.coffee.shop.application.model.Cappuccino;
import huri.karatay.coffee.shop.application.model.Coffee;
import huri.karatay.coffee.shop.application.model.CoffeeType;
import huri.karatay.coffee.shop.application.model.Doppio;
import huri.karatay.coffee.shop.application.model.Espresso;
import huri.karatay.coffee.shop.application.model.HotWater;
import huri.karatay.coffee.shop.application.model.Mocha;

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
	            case HOTWATER:
	            	coffee = new HotWater();
	            	break;
	        }

	        return coffee;
	    }

}
