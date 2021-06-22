package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import huri.karatay.coffee.shop.application.model.Americano;

class AmericanoTest {

    @Test
    void shouldGetCostSuccessfully() {
    	Americano americano = new Americano();
    	assertEquals(10, americano.getCost());
    }
    
    @Test 
    void shouldPrepareSuccessfully() {
    	Americano americano = new Americano();
    	assertEquals("1 dose espresso and 4 dose hot water", americano.prepare());
    }
    
    @Test 
    void shouldGetClassNameSuccessfully() {
    	Americano americano = new Americano();
    	assertEquals("Americano", americano.toString());
    }
}