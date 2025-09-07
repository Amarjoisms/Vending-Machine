package Utility;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Payment {
    double amountInserted;
    double itemPrice;

    public Payment(double amountInserted, double itemPrice) {
        this.amountInserted = amountInserted;
        this.itemPrice = itemPrice;
    }


}
