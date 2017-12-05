package com.VendingMachineLads;

import com.VendingMachineLads.money.Money;

public class Item {

    private String itemName = "";
    private Double itemPrice = 0.0;

    public Item(String itemName, Number itemPrice) {
        this.itemName = itemName;
        this.itemPrice = Money.returnValue(itemPrice);
    }

    public String getItemName() {
        return itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    @Override
    public String toString() {
        return "Item Name :'" + itemName + '\'' +
                "Item Price" + itemPrice;
    }

    public boolean dispence(VendingMachine vendingMachine) {
        vendingMachine.Dispenser.dispenseItem(this,vendingMachine.CashPayment);
        return true;
    }
}
