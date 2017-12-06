package com.PizzaVendingMachine.Cooking;

public class Cook {

    String makePizza(Recipe tempRecipe){
        if(tempRecipe != null){

            String tempString = cookPizza(tempRecipe);
            return tempString;
        }

        return ("Soz Boz");
    }

    private boolean  prePizza(String[] tempIngredients){
        return true;
    }

    private String cookPizza(Recipe tempRecipe){
        if(prePizza(tempRecipe.getPizzaIngredients())) {
            int tempTime = tempRecipe.getPizzaTime();
            return ("will be cooked in " + tempTime + " Thank You");
        }else{
            return ("Soz Boz");
        }

    }

}
