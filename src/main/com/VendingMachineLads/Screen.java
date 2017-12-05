package com.VendingMachineLads;

public class Screen {

    private final String BREAKER_LINE = "=========================\n";

    public String formatForScreen(String s){
        String returner = "";
        returner += BREAKER_LINE;
        returner += s + "\n";
        returner += BREAKER_LINE;
        return returner;
    }

}
