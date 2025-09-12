package state;

import Model.Controller;

public class amountPayState implements State{
    Controller vmachine;

    public amountPayState(Controller vmachine) {
        this.vmachine = vmachine;
    }


    @Override
    public void amountInsert() {
        System.out.println("Coin already inserted.");

    }

    @Override
    public void selectItem() {
        System.out.println("Item selected. Dispensing...");
        vmachine.setState(vmachine.dispenseItem());

    }

    @Override
    public void dispenseItem() {
        System.out.println("Please insert amount and select item first.");

    }

}
