package state;

import Model.Controller;

public class outOfStockState implements State{
    Controller vmachine;

    public outOfStockState(Controller vmachine) {
        this.vmachine = vmachine;
    }


    @Override
    public void amountInsert() {

    }

    @Override
    public void selectItem() {

    }

    @Override
    public void dispenseItem() {

    }
}
