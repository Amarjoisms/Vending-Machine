package state;

import Model.Controller;

public class readyState implements State{
    Controller vmachine;

    public readyState(Controller vmachine) {
        this.vmachine = vmachine;
    }

    @Override
    public void amountInsert() {
        System.out.println("Amount inserted, moving to Payment state");
        vmachine.setState(new amountPayState(vmachine));
    }

    @Override
    public void selectItem() {
        System.out.println("Please insert amount first.");
    }

    @Override
    public void dispenseItem() {
        System.out.println("Please insert amount and select item first.");
    }
}
