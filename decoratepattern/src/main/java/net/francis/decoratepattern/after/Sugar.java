package net.francis.decoratepattern.after;

import net.francis.decoratepattern.Drink;

/**
 * Created by Francis on 2017/4/8.
 */

public class Sugar extends Stuff {

    public Sugar(Drink originalDrink) {
        super(originalDrink);
    }

    @Override
    String getStuffName() {
        return "糖";
    }
}
