package com.VendingMachineLads.Display;

public class ConsoleDisplay implements IScreen {

    private final String BREAKER_LINE = "=========================\n";
    private String returner = "";

    @Deprecated
    public String formatForScreen(String s){
        returner += BREAKER_LINE;
        returner += s + "\n";
        returner += BREAKER_LINE;
        return returner;
    }


    @Override
    public void displayInputOnScreen() {
        System.out.println(returner);
    }

    @Override
    public void readInput(String s) {
        returner += BREAKER_LINE;
        returner += s + "\n";
        returner += BREAKER_LINE;
        displayInputOnScreen();
    }
}
