package com.VendingMachineLads.Display;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class LCDDisplayTest {

    LCDDisplay testObject;

    @Before
    public void setup(){
        testObject = new LCDDisplay();
    }

    @Test
    public void should_ReturnStringFormattedWithBars_WhenGivenString(){
        String currentMoney = "nope";
        String shouldBe = "=========================\n"+
                "£1.40 Left, Selected Fanta\n" +
                "=========================\n";

       testObject.readInput(currentMoney);

    }

}