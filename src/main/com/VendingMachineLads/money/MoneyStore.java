package com.VendingMachineLads.money;

import com.VendingMachineLads.Item;

public class MoneyStore implements Money{

    private Double currentMoneyInMachine;

    public MoneyStore(Number currentMoneyInMachine) {
        this.currentMoneyInMachine = Money.returnValue(currentMoneyInMachine);
    }

    public void removeFundsFromStore(Item item){
        currentMoneyInMachine = currentMoneyInMachine - item.getItemPrice();
    }

    public Double getCurrentMoneyInMachine() {
        return currentMoneyInMachine;
    }

    public void increaseAmountInMoneyStore(Number increaseValue){
        currentMoneyInMachine += (double) increaseValue;
    }


}
