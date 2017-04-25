package net.francis.decoratepattern.after;

import net.francis.decoratepattern.Drink;

/**
 * Created by Francis on 2017/4/8.
 */

public abstract class Stuff implements Drink {

    private Drink originalDrink;

    public Stuff(Drink originalDrink){
        this.originalDrink = originalDrink;
    }

    @Override
    public String make() {
        return originalDrink.make()+",加了一份"+getStuffName();
    }

    abstract String getStuffName();
}
