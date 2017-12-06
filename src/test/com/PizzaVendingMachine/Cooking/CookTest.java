package com.PizzaVendingMachine.Cooking;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CookTest {

    Cook TestObject;

    @Before
    public void setUp(){
        TestObject = new Cook();
    }

    @Test
    public void should_CookPizza_WhenGivenWorkingRecipe(){
        String[] ingredients = {"Base","Tomato","Pepperoni","Cheese"};
        Recipe pepperoniRecipe = new Recipe("Pepperoni Pizza",20,200,ingredients);

        String result = TestObject.makePizza(pepperoniRecipe);
        int tempTime = pepperoniRecipe.getPizzaTime();

        assertEquals(result,"will be cooked in " + tempTime + " Thank You");
    }


}