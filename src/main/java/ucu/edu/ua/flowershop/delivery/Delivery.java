package ucu.edu.ua.flowershop.delivery;

import ucu.edu.ua.flowershop.model.Item;

import java.util.List;

public interface Delivery {
    String deliver(List<Item> items);
}
