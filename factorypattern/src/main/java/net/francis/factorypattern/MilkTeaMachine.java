package net.francis.factorypattern;

/**
 * Created by Francis on 2017/4/7.
 */

public class MilkTeaMachine implements IBeverageMachine {
    @Override
    public Drink makeDrink() {
        return new MilkTea().make();
    }
}
