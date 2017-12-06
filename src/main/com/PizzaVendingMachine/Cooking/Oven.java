package com.PizzaVendingMachine.Cooking;

public class Oven {
    boolean onOff;
    int temp;

    public Oven(boolean onOff, int tempTemp) {
        this.onOff = onOff;
        this.temp = tempTemp;
    }

    void changeOnOff(){
        if(this.onOff == true) {
            this.onOff = false;
            this.temp = 0;
        }else{
            this.onOff = true;
        }

    }

    void setTemp(int tempTemp){
        this.temp = tempTemp;
    }
}


