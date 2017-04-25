package net.francis.factorypattern;

/**
 * Created by Francis on 2017/4/7.
 */

public class PlumJuice extends Drink {
    @Override
    String getInstantPackage() {
        return "速溶酸梅粉";
    }

    @Override
    String getName() {
        return "酸梅汤";
    }
}
