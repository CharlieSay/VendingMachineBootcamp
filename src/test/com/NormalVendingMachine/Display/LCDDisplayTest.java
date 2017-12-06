package com.NormalVendingMachine.Display;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class LCDDisplayTest {

    LCDDisplay testObject;

    @Before
    public void setup(){
        testObject = new LCDDisplay();
    }

    @Test
    public void should_ReturnStringFormattedWithBars_WhenGivenString(){
        String currentMoney = "Released Yacht - £1 Left";
        String shouldBe = "x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+\n"+
                          "x+ Released Yacht - £1 Left x+\n" +
                          "x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+\n";

        String methodReturn = testObject.readInput(currentMoney);

        Assert.assertThat(methodReturn,is(shouldBe));

    }

}