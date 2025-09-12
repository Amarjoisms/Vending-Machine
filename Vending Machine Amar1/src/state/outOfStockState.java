package state;

import Model.Controller;

public class outOfStockState implements State{
    Controller vmachine;

    public outOfStockState(Controller vmachine) {
        this.vmachine = vmachine;
    }


    @Override
    public void amountInsert() {
        System.out.println("Coin already inserted.");

    }

    @Override
    public void selectItem() {
        System.out.println("Stock not available.please select different Item.");

    }

    @Override
    public void dispenseItem() {
        System.out.println("Please insert amount and select item first.");

    }
}
