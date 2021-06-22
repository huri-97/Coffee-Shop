package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import huri.karatay.coffee.shop.application.model.Americano;
import huri.karatay.coffee.shop.application.productDecorator.HotChocolate;

class HotChocolateTest {

	 @Test
	    void shouldGetDoseInfoSuccessfully() {
	    	HotChocolate hotChocolate = new HotChocolate(4);
	    	assertEquals("4 dose hot chocolate", hotChocolate.add());
	    }
}