package net.francis.factorypattern;

/**
 * Created by Francis on 2017/4/7.
 */

public class Cousins {
    private IBeverageMachine mBeverageMachine;

    public void setmBeverageMachine(IBeverageMachine machine) {
        this.mBeverageMachine = machine;
    }

    public Drink takeDrink(){
        if(mBeverageMachine == null){
            throw new NullPointerException("Should set Beverage Machine firstly.");
        }

        return mBeverageMachine.makeDrink();
    }
}
