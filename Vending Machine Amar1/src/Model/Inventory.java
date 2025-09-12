package Model;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    List<Item> items = new ArrayList<>();

    public void addItem(Item item){
        items.add(item);
        System.out.println(item.name+" added to the inventory.");
    }

    public void removeItem(int id,int qty){
        for(Item item : items){
            if(item.getId() == id){
                if(item.getQuantity() >= qty){
                    item.setQuantity(item.getQuantity()-qty);
                } else if (item.getQuantity() == 0) {
                    System.out.println("Sorry for the inconvenience. "+item.name+" is out of stock.");
                } else if (item.getQuantity() < qty) {
                    System.out.println("Requested quantity of " +item.name+ " is not available.");
                }

            }
        }

    }
    public void showItemDetails(){
        System.out.println("Id\t Name\t Price\t Quantity");
        for(Item item : items) {
            System.out.println(item.id + "\t" +
                    item.name +"\t" +
                    item.price +"\t" +
                    item.quantity);
        }
    }

}

