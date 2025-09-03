import Model.Inventory;
import Model.Item;
import Model.Payment;
import Model.VendingMachine;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Payment payment = new Payment();
        VendingMachine vendingmachine = new VendingMachine(inventory,payment);

        Item i1 = new Item(1,"Chocolate",30.0,10);
        Item i2 = new Item(2,"biscuits",25.0,8);
        Item i3 = new Item(3,"cake",35.0,9);

        inventory.addItem(i1);
        inventory.addItem(i2);
        inventory.addItem(i3);

 //       inventory.removeItem(3,2);
 //       inventory.removeItem(1,3);

        inventory.showItemDetails();

        payment.cashPayment();

        vendingmachine.purchaseItem(1,3,150);
        vendingmachine.purchaseItem(2,6,200);
        vendingmachine.purchaseItem(3,10,500);

        inventory.showItemDetails();

        vendingmachine.vendingMachineAmount();
    }

}