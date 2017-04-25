package net.francis.proxypattern;

import android.util.Log;

/**
 * Created by Francis on 2017/4/8.
 */

public class DaLong implements Person {
    private static final String TAG = "DaLong";
    private Person person;

    public DaLong(Person person) {
        this.person = person;
    }

    @Override
    public void signing(int price) {
        Log.i(TAG, "signing: ====== 对方报价："+price);
        if(price<100){
            this.person.signing(price);
        }else {
            negotiate(price);
        }
    }

    public void negotiate(int price){
        Log.i(TAG, "negotiate: ====== 不接受，要求降价 "+(price-80));
    }
}
