package Model;

import Utility.Payment;
import lombok.Getter;
import lombok.Setter;
import state.State;
@Getter
@Setter

public class Controller {
    State readyState;
    State amountPayState;
    State dispenseItemState;
    State outOfStockState;

    State CurrentState;

    public Controller(State readyState, State amountPayState, State dispenseItemState, State outOfStockState, State currentState) {
        this.readyState = readyState;
        this.amountPayState = amountPayState;
        this.dispenseItemState = dispenseItemState;
        this.outOfStockState = outOfStockState;
        CurrentState = currentState;
    }



}
