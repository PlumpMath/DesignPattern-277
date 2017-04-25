package net.francis.proxypattern;

import android.util.Log;

/**
 * Created by Francis on 2017/4/8.
 */

public class XiaoGuang implements Person {
    private static final String TAG = "XiaoGuang";
    @Override
    public void signing(int price) {
        Log.i(TAG, "signing: ======  小光以"+price+"每箱的价格签单.");
    }
}
