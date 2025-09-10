package Model;

import Utility.Payment;
import state.State;

public class Controller {
    State state;
    Inventory iventory;
    Payment payment;

    public Controller(State state, Inventory iventory, Payment payment) {
        this.state = state;
        this.iventory = iventory;
        this.payment = payment;
    }


}
