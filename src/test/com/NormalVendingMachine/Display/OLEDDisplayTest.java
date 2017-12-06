package com.NormalVendingMachine.Display;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class OLEDDisplayTest implements IScreen{

    String testString;

    @Test
    public void should_DisplayOLEDFormat_WhenGivenString(){
        testString = "THIS IS AN OLED SCREEN";
        OLEDDisplay oledDisplay = new OLEDDisplay(this);
       // oledDisplay.Screen.readInput();
    }

    @Test
    public void testMyTest(){
        OLEDDisplay oledDisplay = new OLEDDisplay(this);
        oledDisplay.dodisplayStuffDing();
        assertThat(testString,is("dog"));
    }

    @Override
    public void displayInputOnScreen(String s) {

    }

    @Override
    public String readInput(String s) {
        testString = s;
        return "potato";
    }
}