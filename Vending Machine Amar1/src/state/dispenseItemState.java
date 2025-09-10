package state;

import Model.Controller;

public class dispenseItemState implements State{
    Controller vmachine;

    public dispenseItemState(Controller vmachine) {
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
