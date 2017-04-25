package net.francis.simplefactorypattern.before;

import android.util.Log;

/**
 * Created by Francis on 2017/4/7.
 *
 * 一开始构想的橙汁制作过程
 *
 */

public class OrangeJuice {
    private static final String TAG = "OrangeJuice";
    public void make(){
        //1.拿出一次性饮料杯
        Log.i(TAG, "make: ====== 拿出一次性饮料杯");
        //2.加入速溶橙汁粉
        Log.i(TAG, "make: ====== 加入速溶橙汁粉");
        //3.加水冲兑
        Log.i(TAG, "make: ====== 加水");
        //4.加盖，打包
        Log.i(TAG, "make: ====== 加盖，打包");
    }

}
