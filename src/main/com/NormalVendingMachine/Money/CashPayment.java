package com.NormalVendingMachine.Money;

public class CashPayment implements IPayment {

    private Double currentMoneyInMachine;

    public CashPayment(Number currentMoneyInMachine) {
        this.currentMoneyInMachine = Money.returnValue(currentMoneyInMachine);
    }

    private void removeFundsFromStore(Double itemPrice){
        currentMoneyInMachine -= itemPrice;
    }

    public Double getCurrentMoneyInMachine() {
        return currentMoneyInMachine;
    }

    public void increaseAmountInMoneyStore(Number increaseValue){
        currentMoneyInMachine += (double) increaseValue;
    }

    private boolean checkBalanceAgainstValue(Double balance, Double valueOfItem){
        return balance >= valueOfItem;
    }

    public Double returnChange(){
        Double toReturn = currentMoneyInMachine;
        currentMoneyInMachine = 0.00;
        return toReturn;
    }

    @Override
    public void makePayment(Double paymentValue) {
        if (checkBalanceAgainstValue(paymentValue,getCurrentMoneyInMachine())){
            removeFundsFromStore(paymentValue);
        }
    }
}
