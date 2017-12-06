package com.NormalVendingMachine;

import com.NormalVendingMachine.Display.ConsoleDisplay;
import com.NormalVendingMachine.Display.IScreen;
import org.junit.Test;

import static org.junit.Assert.*;

public class VendingMachineTest{

//    @Test
//    public void should_ReturnNull_WhenStartUpIsNotCalled(){
//        IScreen Screen = new ConsoleDisplay();
//        VendingMachine testObject = new VendingMachine(Screen);
//
//        assertNull(testObject.Dispenser);
//        assertNull(testObject.CashPayment);
//        assertNull(testObject.ConsoleDisplay);
//        assertNull(testObject.ItemList);
//    }

    @Test
    public void should_ReturnNotNull_WhenStartUpIsCalled(){
        IScreen Screen = new ConsoleDisplay();
        VendingMachine testObject = new VendingMachine(Screen);

        assertNotNull(testObject.getDispenser());
        assertNotNull(testObject.getCashPayment());
        assertNotNull(testObject.getConsoleDisplay());
        assertNotNull(testObject.getItemList());
    }



}