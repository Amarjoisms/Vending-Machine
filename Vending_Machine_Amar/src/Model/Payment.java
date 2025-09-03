package Model;

public class Payment {
    double amountPaid;
    double totalAmount;
    double change;
        public void cashPayment(){
            if(amountPaid < totalAmount){
                System.out.println("Insufficient amount paid.please provide amount equal or more than "+totalAmount);
            }
            if (amountPaid > totalAmount){
                change = amountPaid - totalAmount;
                System.out.println("amount to be return is "+change);
            }
            if (amountPaid == totalAmount){
                System.out.println("Exact amount paid thank you.");
            }

    }
}
