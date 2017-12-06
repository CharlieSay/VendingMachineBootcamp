package com.NormalVendingMachine;

import com.NormalVendingMachine.Button.ItemButton;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ButtonTest {

    @Test
    public void shouldCreateButton() {
        Item bread = new Item("bread", 0.50);
        ItemButton button = new ItemButton(1, bread);

        assertThat(button.getId(), is(1));
    }


}