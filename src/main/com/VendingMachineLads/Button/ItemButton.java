package com.VendingMachineLads.Button;

import com.VendingMachineLads.Item;

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
