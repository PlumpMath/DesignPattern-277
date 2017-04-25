package net.francis.factorypattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Cousins cousins = new Cousins();
        //for A 橙汁
        cousins.setmBeverageMachine(new OrangeJuiceMachine());
        Drink drink = cousins.takeDrink();
        Log.i(TAG, "onCreate: ====== "+drink);

        //for B 可乐
        cousins.setmBeverageMachine(new CokeMachine());
        Log.i(TAG, "onCreate: ====== "+cousins.takeDrink());

        //for C 后来添加的奶茶
        cousins.setmBeverageMachine(new MilkTeaMachine());
        Log.i(TAG, "onCreate: ====== "+cousins.takeDrink());

    }
}
