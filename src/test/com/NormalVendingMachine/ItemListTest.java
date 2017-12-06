package com.NormalVendingMachine;

import com.NormalVendingMachine.Button.ItemButton;
import com.NormalVendingMachine.Display.ConsoleDisplay;
import com.NormalVendingMachine.Display.IScreen;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ItemListTest {

    VendingMachine vendingMachine;

    @Before
    public void setup(){
        IScreen Screen = new ConsoleDisplay();
        vendingMachine = new VendingMachine(Screen);
        vendingMachine.getCashPayment().increaseAmountInMoneyStore(5.00);
    }

    @Test
    public void testForItemAdd(){
        ItemList instance = vendingMachine.getItemList();
        Item fanta = new Item("Fanta",1.10);
        ItemButton buttonOne = new ItemButton(1, fanta);

        instance.addToItemList(buttonOne,fanta);

        boolean expected = instance.getItemsFromList(vendingMachine, vendingMachine.getCashPayment(), buttonOne);

        assertTrue(expected);
    }
    @Test
    public void testForMultipleItemsThenRetrieveSpecificItem(){
        ItemList instance = vendingMachine.getItemList();
        Item fanta = new Item("Fanta",1.10);
        ItemButton buttonOne = new ItemButton(1, fanta);
        Item coke = new Item("Coke",1.20);
        ItemButton buttonTwo = new ItemButton(2, coke);
        Item sparklingWater = new Item("Sparking Water",0.70);
        ItemButton buttonThree = new ItemButton(3, sparklingWater);

        instance.addToItemList(buttonOne,fanta);
        instance.addToItemList(buttonTwo,coke);
        instance.addToItemList(buttonThree,sparklingWater);

        boolean expected = instance.getItemsFromList(vendingMachine, vendingMachine.getCashPayment(), buttonTwo);

        assertTrue(expected);
    }

    @Test
    public void testButtonNumberAssign(){
        ItemList instance = vendingMachine.getItemList();
        Item fanta = new Item("Fanta",1.10);
        ItemButton buttonOne = new ItemButton(1, fanta);
        Item coke = new Item("Coke",1.20);
        ItemButton buttonTwo = new ItemButton(2, coke);

        vendingMachine.getItemList().addToItemList(buttonOne,fanta);
        vendingMachine.getItemList().addToItemList(buttonTwo,coke);

        boolean expected = instance.getItemsFromList(vendingMachine, vendingMachine.getCashPayment(), buttonTwo);

        assertTrue(expected);
    }
}