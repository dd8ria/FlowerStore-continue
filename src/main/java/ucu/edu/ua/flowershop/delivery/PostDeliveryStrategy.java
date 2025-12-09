package ucu.edu.ua.flowershop.delivery;

import ucu.edu.ua.flowershop.model.Item;

import java.util.List;

public class PostDeliveryStrategy implements Delivery {
    @Override
    public String deliver(List<Item> items) {
        int count = items.size();
        return "Delivering " + count + " item(s) using regular post.";
    }
}
