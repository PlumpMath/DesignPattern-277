package net.francis.strategypattern;

/**
 * Created by Francis on 2017/4/8.
 *
 * 双十二算法
 *
 */

public class DoubleTwelveDayStrategy implements ActivityStrategy {
    @Override
    public String getActivityPrice() {
        //经过一系列算法
        return "(双十二)满12元立减2元";
    }
}
