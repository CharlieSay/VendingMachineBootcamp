package com.VendingMachineLads;


import com.VendingMachineLads.Money.IPayment;

import java.util.Collection;
import java.util.LinkedList;

public class Dispenser {

    public Collection<Item> dispensedItems = new LinkedList<>();

    public boolean dispenseItem(Item item, IPayment paymentType){
        if (item.getItemName() != null && item.getItemPrice() != 0.00){
            dispensedItems.add(item);
            paymentType.makePayment(item.getItemPrice());
            return true;
        }else{
            return false;
        }
    }

}
