package net.francis.factorypattern;

/**
 * Created by Francis on 2017/4/7.
 */

public class OrangeJuice extends Drink {
    @Override
    String getInstantPackage() {
        return "速溶橙汁粉";
    }

    @Override
    String getName() {
        return "橙汁";
    }
}
