package com.PizzaVendingMachine.Cooking;

public class Recipe {

    String pizzaName;
    Integer pizzaTime;
    Integer pizzaTemp;
    String[] pizzaIngredients;

    public Recipe(String pizzaName, Integer pizzaTime, Integer pizzaTemp, String[] pizzaIngredients) {
        this.pizzaName = pizzaName;
        this.pizzaTime = pizzaTime;
        this.pizzaTemp = pizzaTemp;
        this.pizzaIngredients = pizzaIngredients;
    }

    public String getPizzaName() {
        return pizzaName;
    }

    public Integer getPizzaTime() {
        return pizzaTime;
    }

    public Integer getPizzaTemp() {
        return pizzaTemp;
    }

    public String[] getPizzaIngredients() {
        return pizzaIngredients;
    }
}
