package com.VendingMachineLads;

import com.VendingMachineLads.money.MoneyStore;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ItemListTest {

    VendingMachine vendingMachine;

    @Before
    public void setup(){
        vendingMachine = new VendingMachine();
        vendingMachine.onStartUp();
        vendingMachine.MoneyStore.increaseAmountInMoneyStore(5.00);
    }

    @Test
    public void testForItemAdd(){
        ItemList instance = vendingMachine.ItemList;
        Item fanta = new Item("Fanta",1.10);
        Button buttonOne = new Button(1, fanta);

        instance.addToItemList(buttonOne,fanta);

        boolean expected = instance.getItemsFromList(vendingMachine, vendingMachine.MoneyStore, buttonOne);

        assertTrue(expected);
    }
    @Test
    public void testForMultipleItemsThenRetrieveSpecificItem(){
        ItemList instance = vendingMachine.ItemList;
        Item fanta = new Item("Fanta",1.10);
        Button buttonOne = new Button(1, fanta);
        Item coke = new Item("Coke",1.20);
        Button buttonTwo = new Button(2, coke);
        Item sparklingWater = new Item("Sparking Water",0.70);
        Button buttonThree = new Button(3, sparklingWater);

        instance.addToItemList(buttonOne,fanta);
        instance.addToItemList(buttonTwo,coke);
        instance.addToItemList(buttonThree,sparklingWater);

        boolean expected = instance.getItemsFromList(vendingMachine, vendingMachine.MoneyStore, buttonTwo);

        assertTrue(expected);
    }

    @Test
    public void testButtonNumberAssign(){
        ItemList instance = vendingMachine.ItemList;
        Item fanta = new Item("Fanta",1.10);
        Button buttonOne = new Button(1, fanta);
        Item coke = new Item("Coke",1.20);
        Button buttonTwo = new Button(2, coke);

        vendingMachine.ItemList.addToItemList(buttonOne,fanta);
        vendingMachine.ItemList.addToItemList(buttonTwo,coke);

        boolean expected = instance.getItemsFromList(vendingMachine, vendingMachine.MoneyStore, buttonTwo);

        assertTrue(expected);
    }
}