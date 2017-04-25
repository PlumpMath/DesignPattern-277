package net.francis.factorypattern;

/**
 * Created by Francis on 2017/4/7.
 */

public class MilkTea extends Drink {
    @Override
    String getInstantPackage() {
        return "速溶奶茶粉";
    }

    @Override
    String getName() {
        return "奶茶";
    }
}
