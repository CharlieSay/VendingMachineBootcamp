package com.VendingMachineLads.money;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MoneyStoreTest {

    MoneyStore testSubject;

    @Before
    public void setUp(){
        testSubject = new MoneyStore(0);
    }

    @Test
    public void should_IncreaseAmountBy5_WhenIncreasingValueBy5(){
        Double increaseByFive = 5.00;

        testSubject.increaseAmountInMoneyStore(increaseByFive);

        assertThat(testSubject.getCurrentMoneyInMachine(),is(5.00));
    }

    @Test
    public void should_RejectNonDouble_WhenAnythingButDouble(){
        int increaseByTen = 10;
    }

    @After
    public void tearDown(){
        testSubject = null;
    }

}