package com.PizzaVendingMachine;

import com.NormalVendingMachine.Display.LCDDisplay;
import com.NormalVendingMachine.VendingMachine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PizzaVendingMachineTest {

    VendingMachine testObject;

    @Before
    public void setUp(){
        LCDDisplay lcdDisplay = new LCDDisplay();
        testObject = new PizzaVendingMachine(lcdDisplay);
    }

    @Test
    public void should_HaveObjects(){
        assertNotNull(testObject.getDispenser());
        assertNotNull(testObject.getCashPayment());
        assertNotNull(testObject.getConsoleDisplay());
        assertNotNull(testObject.getItemList());
    }

}