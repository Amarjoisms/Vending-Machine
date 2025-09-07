package Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Item {
    int id;
    String name;
    double price;
    int quantity;

    public Item(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public boolean isAvailable(){

        return true;
    }

    public void reduceQuantity(){


    }


}


