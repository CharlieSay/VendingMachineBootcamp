package com.VendingMachineLads;


import com.VendingMachineLads.money.CashPayment;

import java.util.Collection;
import java.util.LinkedList;

public class Dispenser {

    public Collection<Item> dispensedItems = new LinkedList<>();

    public boolean dispenseItem(Item item, CashPayment cashPayment){
        if (item.getItemName() != null && item.getItemPrice() != 0.00){
            dispensedItems.add(item);
            cashPayment.makePayment(item.getItemPrice());
            return true;
        }else{
            return false;
        }
    }

}
