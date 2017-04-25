package net.francis.proxypattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaLong daLong = new DaLong(new XiaoGuang());
        //第一轮，对方报价120
        daLong.signing(120);
        //第二轮，对方报价100
        daLong.signing(100);
        //第三轮，对方报价90
        daLong.signing(90);
    }
}
