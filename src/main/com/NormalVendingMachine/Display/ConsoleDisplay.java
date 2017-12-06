package com.NormalVendingMachine.Display;

public class ConsoleDisplay implements IScreen {

    private final String BREAKER_LINE = "=========================\n";
   // private String returner = "";

    @Override
    public void displayInputOnScreen(String returner) {
        System.out.println(returner);
    }

    @Override
    public String readInput(String s) {
        String toDisplay = "";
        toDisplay += BREAKER_LINE;
        toDisplay += s + "\n";
        toDisplay += BREAKER_LINE;
        displayInputOnScreen(toDisplay);
        return toDisplay;
    }
}
