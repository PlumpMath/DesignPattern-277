package net.francis.strategypattern;

/**
 * Created by Francis on 2017/4/8.
 *
 * 圣诞节算法
 *
 */

public class ChristmasStrategy implements ActivityStrategy {
    @Override
    public String getActivityPrice() {
        //经过一系列算法
        return "(圣诞节)买热干面+饮品套餐，送大苹果一个";
    }
}
