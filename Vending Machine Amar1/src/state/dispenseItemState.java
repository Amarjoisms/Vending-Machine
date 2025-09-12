package state;

import Model.Controller;

public class dispenseItemState implements State{
    Controller vmachine;

    public dispenseItemState(Controller vmachine) {
        this.vmachine = vmachine;
    }

    @Override
    public void amountInsert() {
        System.out.println("Wait, dispensing item.");

    }

    @Override
    public void selectItem() {
        System.out.println("Already dispensing...");

    }

    @Override
    public void dispenseItem() {
        System.out.println("Item dispensed.");
        vmachine.setState(vmachine.readyState());

    }

}
