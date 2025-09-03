package Model;

public class VendingMachine {
    double changeStorage = 500.0;
    Inventory inventory;
    Payment payment;
    Item items;

    public VendingMachine(Inventory inventory, Payment payment) {
        this.inventory = inventory;
        this.payment = payment;
        this.items = items;
    }
    public void purchaseItem(int id,int qty,double amountPaid){
        for (Item item : inventory.items) {
            if (id == item.getId()) {
                if (payment.change < changeStorage) {
                    if (amountPaid > (item.getPrice() * qty)) {
                        if (item.getQuantity() >= qty) {
                            changeStorage = changeStorage - payment.change;
                            item.setQuantity(item.getQuantity()-qty);
                            changeStorage = changeStorage + payment.totalAmount;
                            System.out.println(item.name + " Dispensed successfully.");

                        } else {
                            System.out.print(item.name + " Can't be dispensed.");
                        }
                    }

                }
            }

        }


    }
    public void vendingMachineAmount(){
        changeStorage=changeStorage+payment.totalAmount;
        System.out.println("Amount available in vending machine is "+changeStorage);
    }


}
