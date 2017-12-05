package com.VendingMachineLads.Display;

public class LCDDisplay implements IScreen {

    public String LCD_FORMAT = "";
    public String displayOut = "";

    @Override
    public void displayInputOnScreen() {
        System.out.println(displayOut);
    }

    @Override
    public void readInput(String s) {
        inputMatcher(s);
        displayOut += LCD_FORMAT + "\n";
        displayOut += "x+ "+s + " x+\n";
        displayOut += LCD_FORMAT + "\n";
        displayInputOnScreen();
    }

    private void inputMatcher(String s){
        for (int i = 0; i<s.length()/2; i++){
            LCD_FORMAT += "x+";
        }
        LCD_FORMAT += "x+x+x+";
    }
}
