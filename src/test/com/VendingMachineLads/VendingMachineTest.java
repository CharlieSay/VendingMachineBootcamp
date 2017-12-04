package com.VendingMachineLads;

import org.junit.Test;

import static org.junit.Assert.*;

public class VendingMachineTest {

    @Test
    public void should_ReturnNull_WhenStartUpIsNotCalled(){
        VendingMachine testObject = new VendingMachine();

        assertNull(testObject.Dispenser);
        assertNull(testObject.MoneyStore);
        assertNull(testObject.Screen);
    }

    @Test
    public void should_ReturnNotNull_WhenStartUpIsCalled(){
        VendingMachine testObject = new VendingMachine();

        testObject.onStartUp();

        assertNotNull(testObject.Dispenser);
        assertNotNull(testObject.MoneyStore);
        assertNotNull(testObject.Screen);
    }



}