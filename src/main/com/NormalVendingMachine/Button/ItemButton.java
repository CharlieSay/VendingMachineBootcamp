package com.NormalVendingMachine.Button;

import com.NormalVendingMachine.Item;

public class ItemButton extends Button {

    public Item getItem() {
        return item;
    }

    Item item;

    public ItemButton(int id, Item item) {
        super(id);
        this.item = item;
    }


}
