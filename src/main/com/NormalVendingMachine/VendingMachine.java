package com.NormalVendingMachine;

import com.NormalVendingMachine.Button.Button;
import com.NormalVendingMachine.Button.CancelButton;
import com.NormalVendingMachine.Button.ItemButton;
import com.NormalVendingMachine.Display.ConsoleDisplay;
import com.NormalVendingMachine.Display.IScreen;
import com.NormalVendingMachine.Money.CashPayment;

//Customer, Vending Machine, Sale, Item, ItemList
public class VendingMachine {


    private Dispenser Dispenser;
    private IScreen ConsoleDisplay;
    private CashPayment CashPayment;
    private ItemList ItemList;
    private VendingMachine vendingMachine;

    public com.NormalVendingMachine.Dispenser getDispenser() {
        return Dispenser;
    }

    public IScreen getConsoleDisplay() {
        return ConsoleDisplay;
    }

    public com.NormalVendingMachine.Money.CashPayment getCashPayment() {
        return CashPayment;
    }

    public com.NormalVendingMachine.ItemList getItemList() {
        return ItemList;
    }

    public static void main(String[] args) {
        ConsoleDisplay consoleDisplay = new ConsoleDisplay();
        VendingMachine vendingMachine = new VendingMachine(consoleDisplay);
  //      vendingMachine.buttonPress(buttonSelection);
    }

    public VendingMachine(IScreen Screen){
        ConsoleDisplay = Screen;
        Dispenser = new Dispenser();
        CashPayment = new CashPayment(0);
        ItemList = new ItemList();
        itemListPopulate();
    }

    private void buttonPress(Button button){
        if (button instanceof ItemButton){
            getItemList().getItemsFromList(this, CashPayment,(ItemButton) button);
        }else if(button instanceof CancelButton){
            getCashPayment().returnChange();
        }

    }

    public void itemListPopulate(){
        Item Fanta = new Item("Fanta", 1.20);
        Item DrPepper = new Item("Dr Pepper", 1.20);
        Item OasisRed = new Item("Oasis Red", 1.00);
        Item Lucozade = new Item("Lucozade", 1.20);
        Item Bread = new Item("Bread", 0.10);
        Item Yacht = new Item("Yacht", 9999.99);

        ItemList.addToItemList(new ItemButton(1,Fanta),Fanta);
        ItemList.addToItemList(new ItemButton(2,DrPepper), DrPepper);
        ItemList.addToItemList(new ItemButton(3,OasisRed), OasisRed);
        ItemList.addToItemList(new ItemButton(4,Lucozade), Lucozade);
        ItemList.addToItemList(new ItemButton(5,Bread), Bread);
        ItemList.addToItemList(new ItemButton(6,Yacht), Yacht);

    }
}
