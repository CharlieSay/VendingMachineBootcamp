package com.NormalVendingMachine.Display;

public class OLEDDisplay {

    IScreen Screen;

    public OLEDDisplay(IScreen s){
        Screen = s;
    }

    public void dodisplayStuffDing(){
        Screen.readInput("dog");
    }

}
