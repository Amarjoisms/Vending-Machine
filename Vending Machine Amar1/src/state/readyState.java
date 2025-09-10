package state;

import Model.Controller;

public class readyState implements State{
    Controller vmachine;

    public readyState(Controller vmachine) {
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
