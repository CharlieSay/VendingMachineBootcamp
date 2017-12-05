package com.VendingMachineLads;

public class Button {
    int id;
    Item item;

    public Button(int id, Item item) {
        this.id = id;
        this.item = item;
    }

    public int getId() {
        return id;
    }

}
