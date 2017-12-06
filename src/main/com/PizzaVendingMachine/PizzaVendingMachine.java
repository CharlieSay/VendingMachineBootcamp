package com.PizzaVendingMachine;

import com.NormalVendingMachine.Button.ItemButton;
import com.NormalVendingMachine.Display.IScreen;
import com.NormalVendingMachine.Item;
import com.NormalVendingMachine.VendingMachine;

public class PizzaVendingMachine extends VendingMachine{

    public PizzaVendingMachine(IScreen Screen) {
        super(Screen);
    }

    @Override
    public void itemListPopulate(){
        Item Pepperoni = new Item("Pepperoni Pizza", 100.00);

        this.getItemList().addToItemList(new ItemButton(1,Pepperoni),Pepperoni);
    }
}
