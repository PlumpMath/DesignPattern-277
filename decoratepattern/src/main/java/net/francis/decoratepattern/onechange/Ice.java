package net.francis.decoratepattern.onechange;

import net.francis.decoratepattern.Drink;

/**
 * Created by Francis on 2017/4/8.
 */

public class Ice implements Drink {

    private Drink originalDrink;

    public Ice(Drink originalDrink){
        this.originalDrink = originalDrink;
    }

    @Override
    public String make() {
        return originalDrink.make()+",加了一份冰";
    }
}
