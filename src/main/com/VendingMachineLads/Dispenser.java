package com.VendingMachineLads;


import com.VendingMachineLads.money.MoneyStore;

import java.util.Collection;
import java.util.LinkedList;

public class Dispenser {

    public Collection<Item> dispensedItems = new LinkedList<>();

    public boolean dispenseItem(Item item, MoneyStore moneyStore){
        if (item.getItemName() != null && item.getItemPrice() != 0.00){
            dispensedItems.add(item);
            moneyStore.removeFundsFromStore(item);
            return true;
        }else{
            return false;
        }
    }

}
