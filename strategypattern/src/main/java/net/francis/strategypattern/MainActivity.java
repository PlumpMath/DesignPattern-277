package net.francis.strategypattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //收银台，默认
        Checkstand checkstand = new Checkstand();
        checkstand.printBill();

        //感恩节期间
        checkstand.setmActivityStrategy(new ThanksGivingDayStrategy());
        checkstand.printBill();

        //双十二
        checkstand.setmActivityStrategy(new DoubleTwelveDayStrategy());
        checkstand.printBill();

        //圣诞节期间
        checkstand.setmActivityStrategy(new ChristmasStrategy());
        checkstand.printBill();
    }
}
