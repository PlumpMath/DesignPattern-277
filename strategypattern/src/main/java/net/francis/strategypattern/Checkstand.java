package net.francis.strategypattern;

import android.util.Log;

/**
 * Created by Francis on 2017/4/8.
 *
 * 支持各种活动策略算法的收银台
 *
 */

public class Checkstand {
    private static final String TAG = "Checkstand";
    private ActivityStrategy mActivityStrategy;

    public Checkstand(){
        mActivityStrategy = new DefaultActivityStrategy();
    }

    public Checkstand(ActivityStrategy activityStrategy){
        this.mActivityStrategy = activityStrategy;
    }

    public void setmActivityStrategy(ActivityStrategy activityStrategy) {
        this.mActivityStrategy = activityStrategy;
    }

    //结账
    public void printBill(){
        Log.i(TAG, "printBill: ====== 本次账单活动 ："+mActivityStrategy.getActivityPrice());
    }
}
