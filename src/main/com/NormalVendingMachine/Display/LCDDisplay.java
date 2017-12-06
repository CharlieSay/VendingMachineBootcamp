package com.NormalVendingMachine.Display;

public class LCDDisplay implements IScreen {

    public String displayOut = "";

    @Override
    public void displayInputOnScreen(String s) {
        System.out.println(s);
    }

    @Override
    public String readInput(String s) {
        String LCD_Format = inputMatcher(s);
        displayOut += LCD_Format + "\n";
        displayOut += "x+ "+s + " x+\n";
        displayOut += LCD_Format + "\n";
        displayInputOnScreen(displayOut);
        return displayOut;
    }

    private String inputMatcher(String s){
        String returnLCDStringLength = "";
        for (int i = 0; i<s.length()/2; i++){
            returnLCDStringLength += "x+";
        }
        returnLCDStringLength += "x+x+x+";
        return returnLCDStringLength;
    }
}
