package net.francis.simplefactorypattern.onechange;

import android.util.Log;

/**
 * Created by Francis on 2017/4/7.
 *
 * 稍微经过改良后
 * 抽象出来的饮料制作过程，只需要改变加入的速溶物质则可得到对应的饮料
 * 例子有：Coke 可乐粉、PlumJuice 酸梅粉、OrangeJuice 橙汁粉
 *
 */

public abstract class Drink {
    private static final String TAG = "Drink";
    public void make(){
        //1.拿出一次性饮料杯
        Log.i(TAG, "make: ====== 拿出一次性饮料杯");
        //2.加入速溶粉
        Log.i(TAG, "make: ====== 加入"+getInstantPackage());
        //3.加水冲兑
        Log.i(TAG, "make: ====== 加水");
        //4.加盖，打包
        Log.i(TAG, "make: ====== 加盖，打包");
    }

    abstract String getInstantPackage();
}
