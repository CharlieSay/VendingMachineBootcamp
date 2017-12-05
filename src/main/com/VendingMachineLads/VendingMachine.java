package com.VendingMachineLads;

import com.VendingMachineLads.money.MoneyStore;

//Customer, Vending Machine, Sale, Item, ItemList
public class VendingMachine {


    public Dispenser Dispenser;
    public Screen Screen;
    public MoneyStore MoneyStore;
    public ItemList ItemList;

    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.onStartUp();
        vendingMachine.MoneyStore.increaseAmountInMoneyStore(1.30);
        Button buttonSelection = vendingMachine.ItemList.returnButtonItem(3);
        vendingMachine.buttonPress(buttonSelection);
    }

    public void onStartUp(){
        Dispenser = new Dispenser();
        Screen = new Screen();
        MoneyStore = new MoneyStore(0);
        ItemList = new ItemList();
        itemListPopulate();
    }

    private void  buttonPress(Button button){
        ItemList.getItemsFromList(this, MoneyStore,button);
    }

    private void itemListPopulate(){
        Item Fanta = new Item("Fanta", 1.20);
        Item DrPepper = new Item("Dr Pepper", 1.20);
        Item OasisRed = new Item("Oasis Red", 1.00);
        Item Lucozade = new Item("Lucozade", 1.20);
        Item Bread = new Item("Bread", 0.10);
        Item Yacht = new Item("Yacht", 9999.99);

        ItemList.addToItemList(new Button(1,Fanta),Fanta);
        ItemList.addToItemList(new Button(2,DrPepper), DrPepper);
        ItemList.addToItemList(new Button(3,OasisRed), OasisRed);
        ItemList.addToItemList(new Button(4,Lucozade), Lucozade);
        ItemList.addToItemList(new Button(5,Bread), Bread);
        ItemList.addToItemList(new Button(6,Yacht), Yacht);

    }
}
