package net.francis.strategypattern;

/**
 * Created by Francis on 2017/4/8.
 *
 * 感恩节后动算法
 *
 */

public class ThanksGivingDayStrategy implements ActivityStrategy {
    @Override
    public String getActivityPrice() {
        //经过一系列算法
        return "(感恩节)所有饮品一律5折";
    }
}
