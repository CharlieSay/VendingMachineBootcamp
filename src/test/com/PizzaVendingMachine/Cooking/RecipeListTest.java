package com.PizzaVendingMachine.Cooking;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class RecipeListTest {


    @Test
    public void should_AddReceipeToRecipeList_WhenGivenPepperoni(){
        RecipeList recipeList = new RecipeList();
        String[] ingredients = {"Base","Tomato","Pepperoni","Cheese"};
        Recipe pepperoniRecipe = new Recipe("Pepperoni",20,200,ingredients);

        recipeList.addToList(pepperoniRecipe);

     //   assertThat(recipeList.recipeList("Pepperoni"),is(pepperoniRecipe));
    }


}