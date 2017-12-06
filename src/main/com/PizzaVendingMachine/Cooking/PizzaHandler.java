package com.PizzaVendingMachine.Cooking;

public class PizzaHandler {
    Cook myCook;
    Oven myOven;
    RecipeList myRecipeList;

    public PizzaHandler() {
        this.myCook = new Cook();
        this.myOven = new Oven(false, 0);
        this.myRecipeList =  new RecipeList();
    }

    void addRecipe(String tempName, int tempTemp, int tempTime, String[] tempIngedents){
        myRecipeList.createRecipe(tempName, tempTemp, tempTime,tempIngedents);
    }

    Recipe findRecipe(String tempName){
        Recipe tempRecipe = myRecipeList.getRecipe(tempName);
        return tempRecipe;
    }






}


