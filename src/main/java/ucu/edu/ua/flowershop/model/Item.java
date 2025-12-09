package ucu.edu.ua.flowershop.model;

import flower.store.Flower;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Item {
    private Flower flower;
    private int quantity;

    public Item(Flower flower, int quantity) {
        this.flower = flower;
        this.quantity = quantity;
    }

    public double getPrice() {
        if (flower == null) {
            return 0.0;
        }
        return flower.getPrice() * quantity;
    }
}
