package net.francis.decoratepattern.after;

import net.francis.decoratepattern.Drink;

/**
 * Created by Francis on 2017/4/8.
 */

public class Ice extends Stuff {

    public Ice(Drink originalDrink) {
        super(originalDrink);
    }

    @Override
    String getStuffName() {
        return "冰";
    }
}
