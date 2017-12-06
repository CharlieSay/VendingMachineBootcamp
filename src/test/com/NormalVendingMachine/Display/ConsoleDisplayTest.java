package com.NormalVendingMachine.Display;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ConsoleDisplayTest {

    ConsoleDisplay testObject;

    @Before
    public void setUp(){
        testObject = new ConsoleDisplay();
    }

    @Test
    public void should_ReturnStringFormattedWithBars_WhenGivenString(){
        String currentMoney = "£1.40 Left, Selected Fanta";
        String shouldBe = "=========================\n"+
                          "£1.40 Left, Selected Fanta\n" +
                          "=========================\n";

        String result = testObject.readInput(currentMoney);

        assertThat(result,is(shouldBe));
    }


}