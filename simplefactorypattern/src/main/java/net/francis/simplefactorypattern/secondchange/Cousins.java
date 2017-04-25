package net.francis.simplefactorypattern.secondchange;

import net.francis.simplefactorypattern.onechange.Coke;
import net.francis.simplefactorypattern.onechange.Drink;
import net.francis.simplefactorypattern.onechange.OrangeJuice;
import net.francis.simplefactorypattern.onechange.PlumJuice;

/**
 * Created by Francis on 2017/4/7.
 *
 * 这个类就是简单工厂类
 *
 * 因为不能违反  开闭原则
 * 所以简单工厂模式只适合产品类别比较少，且固定的场景
 *
 */

public class Cousins {

    public static Drink create(String drinkType){
        switch (drinkType){
            case "橙汁":
                return new OrangeJuice();
            case "酸梅汤":
                return new PlumJuice();
            case "可乐":
                return new Coke();
            default:
                return new OrangeJuice();
        }
    }
}
