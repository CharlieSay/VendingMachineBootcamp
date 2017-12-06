package com.PizzaVendingMachine.Cooking;

import com.sun.org.apache.regexp.internal.RE;

import java.util.ArrayList;
import java.util.List;

public class RecipeList {

    List<Recipe> recipeList = new ArrayList<>();

    public void addToList(Recipe recipe){
        recipeList.add(recipe);
    }

    public Recipe getRecipe(String recipeName){
        for (Recipe myRecipe : recipeList){
            if (myRecipe.pizzaName.equalsIgnoreCase(recipeName)){
                return myRecipe;
            }else{ continue;}
        }
        return null;
    }

    public void createRecipe(String tempName,int tempTemp,int tempTime, String[] tempIngredents){
        Recipe tempRecipe = new Recipe(tempName, tempTemp, tempTime, tempIngredents);
        addToList(tempRecipe);
    }

}
