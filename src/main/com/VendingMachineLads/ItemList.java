package com.VendingMachineLads;

import com.VendingMachineLads.Button.Button;
import com.VendingMachineLads.Button.ItemButton;
import com.VendingMachineLads.Display.ConsoleDisplay;
import com.VendingMachineLads.Display.IScreen;
import com.VendingMachineLads.Money.CashPayment;

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

    public boolean getItemsFromList(VendingMachine vendingMachine, CashPayment cashPayment, ItemButton button) {
        Double moneyOfItemSpecified = button.getItem().getItemPrice();
        String nameOfItemSpecified = button.getItem().getItemName();
        IScreen consoleDisplay = vendingMachine.getConsoleDisplay();

        if (moneyOfItemSpecified <= cashPayment.getCurrentMoneyInMachine()){
            consoleDisplay.readInput("Dispensed : " + nameOfItemSpecified);
            consoleDisplay.readInput("Remaining Money : £"+ cashPayment.getCurrentMoneyInMachine());
          //  System.out.println(dispenseConfirmation);
           // System.out.println(remainingMoney);
            return button.getItem().dispence(vendingMachine);
        }else{
            String notEnoughMoneyConfirmation =   consoleDisplay.readInput("Not enough Money");
            System.out.println(notEnoughMoneyConfirmation);
            return false;
        }
    }
}


