package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import huri.karatay.coffee.shop.application.model.Americano;
import huri.karatay.coffee.shop.application.model.CoffeeFactory;
import huri.karatay.coffee.shop.application.model.CoffeeType;
import huri.karatay.coffee.shop.application.model.Mocha;

class CoffeeFactoryTest {
	
	 @Test
	    void shouldCreateAmericanoSuccessfully() {
	    	CoffeeFactory cf = new CoffeeFactory();
	    	assertTrue(cf.createCoffee(CoffeeType.AMERICANO) instanceof Americano);
	  
	    }
	 
	 @Test
	    void shouldCreateMochaSuccessfully() {
	    	CoffeeFactory cf = new CoffeeFactory();
	    	assertTrue(cf.createCoffee(CoffeeType.MOCHA) instanceof Mocha);
	  
	    }

}