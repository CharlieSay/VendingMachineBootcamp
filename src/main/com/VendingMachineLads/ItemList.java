package com.VendingMachineLads;

import com.VendingMachineLads.Display.ConsoleDisplay;
import com.VendingMachineLads.money.CashPayment;

import java.util.HashMap;
import java.util.Map;

public class ItemList {

    private Map<Button,Item> itemList = new HashMap<Button,Item>();
    private Integer lastButtonNumber = 1;

    public void addToItemList(Button button, Item item){
        itemList.put(button,item);
        lastButtonNumber++;
    }

    public Button returnButtonItem(int buttonNumber){
        for (Button key : itemList.keySet()) {
            if (key.getId() == buttonNumber){
                return key;
            }else{
                continue;
            }
        }
        return null;
    }

    @Deprecated
    public Item getItemFromList(Integer buttonRequest) {
        for (int i = 1; i <= itemList.size(); i++) {
            if (i == buttonRequest) {
                return itemList.get(buttonRequest);
            }
        }
        return null;
    }

    public boolean getItemsFromList(VendingMachine vendingMachine, CashPayment cashPayment, Button button) {
        Double moneyOfItemSpecified = button.item.getItemPrice();
        String nameOfItemSpecified = button.item.getItemName();
        ConsoleDisplay consoleDisplay = vendingMachine.ConsoleDisplay;
        if (moneyOfItemSpecified <= cashPayment.getCurrentMoneyInMachine()){
           String dispenseConfirmation = consoleDisplay.formatForScreen("Dispensed : " + nameOfItemSpecified);
            String remainingMoney = consoleDisplay.formatForScreen("Remaining Money : £"+ cashPayment.getCurrentMoneyInMachine());
            System.out.println(dispenseConfirmation);
            System.out.println(remainingMoney);
            return button.item.dispence(vendingMachine);
        }else{
            String notEnoughMoneyConfirmation =  consoleDisplay.formatForScreen("Not enough Money");
            System.out.println(notEnoughMoneyConfirmation);
            return false;
        }
    }
}


