package net.francis.buidlerpattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**
         * 原始做法
         */
        /*
        //A
        HotDryNoodles noodlesA = new HotDryNoodles(true,true,false,true);
        Log.i(TAG, "onCreate: ====== Customer A wants : "+noodlesA);

        //B
        HotDryNoodles noodlesB = new HotDryNoodles(true,false,false,true);
        Log.i(TAG, "onCreate: ====== Customer B wants : "+noodlesB);
        */

        /**
         * Builder做法
         */
        HotDryNoodlesWithBuilder noodlesC = new HotDryNoodlesWithBuilder.Builder()
                .withChili()
                .withParsley()
                .build();
        Log.i(TAG, "onCreate: ====== Customer C wants : "+noodlesC);

        HotDryNoodlesWithBuilder noodlesD = new HotDryNoodlesWithBuilder.Builder()
                .withChili()
                .withParsley()
                .withSauerkraut()
                .withShallot()
                .build();
        Log.i(TAG, "onCreate: ====== Customer D wants : "+noodlesD);
    }
}
