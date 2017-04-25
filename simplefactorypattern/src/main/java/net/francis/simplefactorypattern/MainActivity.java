package net.francis.simplefactorypattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import net.francis.simplefactorypattern.onechange.Drink;
import net.francis.simplefactorypattern.secondchange.Cousins;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //oneChange
        /*OrangeJuice orangeJuice = new OrangeJuice();
        orangeJuice.make();*/

        //secondChange
        Drink drink = Cousins.create("可乐");
        drink.make();
    }
}
