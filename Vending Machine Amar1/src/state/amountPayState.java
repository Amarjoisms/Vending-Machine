package state;

import Model.Controller;

public class amountPayState implements State{
    Controller vmachine;

    public amountPayState(Controller vmachine) {
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
