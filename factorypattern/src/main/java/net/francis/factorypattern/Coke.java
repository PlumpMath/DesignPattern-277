package net.francis.factorypattern;

/**
 * Created by Francis on 2017/4/7.
 */

public class Coke extends Drink {
    @Override
    String getInstantPackage() {
        return "速溶可乐粉";
    }

    @Override
    String getName() {
        return "可乐";
    }
}
