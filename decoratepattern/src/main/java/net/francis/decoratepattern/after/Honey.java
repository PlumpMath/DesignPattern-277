package net.francis.decoratepattern.after;

import net.francis.decoratepattern.Drink;

/**
 * Created by Francis on 2017/4/8.
 */

public class Honey extends Stuff {
    public Honey(Drink originalDrink) {
        super(originalDrink);
    }

    @Override
    String getStuffName() {
        return "蜂蜜";
    }
}
