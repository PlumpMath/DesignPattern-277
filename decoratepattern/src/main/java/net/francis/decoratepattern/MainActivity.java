package net.francis.decoratepattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import net.francis.decoratepattern.after.Honey;
import net.francis.decoratepattern.after.Ice;
import net.francis.decoratepattern.after.Sugar;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //改良尝试一
        /*
        Drink coke = new Coke();
        Log.i(TAG, "onCreate: ====== "+coke.make());

        Drink iceCoke = new Ice(new Coke());
        Log.i(TAG, "onCreate: ====== "+iceCoke.make());
        */

        //抽象改良后
        //老板，来一杯可乐，加冰
        Drink iceCoke = new Ice(new Coke());
        Log.i(TAG, "onCreate: ====== "+iceCoke.make());

        //老板，来一杯酸梅汤，加冰，加糖
        Drink iceSugarPlumJuice = new Ice(new Sugar(new PlumJuice()));
        Log.i(TAG, "onCreate: ====== "+iceSugarPlumJuice.make());

        //老板，来一杯橙汁，加两份冰，加蜂蜜
        Drink iceIceHoneyOrangeJuice = new Ice(new Ice(new Honey(new OrangeJuice())));
        Log.i(TAG, "onCreate: ====== "+iceIceHoneyOrangeJuice.make());

    }
}
