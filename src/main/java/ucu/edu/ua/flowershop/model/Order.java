package ucu.edu.ua.flowershop.model;

import ucu.edu.ua.flowershop.delivery.Delivery;
import ucu.edu.ua.flowershop.payment.Payment;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Order {

    private List<Item> items = new ArrayList<>();
    private Payment payment;
    private Delivery delivery;

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public double calculateTotalPrice() {
        return items.stream()
                .mapToDouble(Item::getPrice)
                .sum();
    }

    public String processOrder() {
        double totalPrice = calculateTotalPrice();
        String paymentResult = payment.pay(totalPrice);
        String deliveryResult = delivery.deliver(items);
        return paymentResult + " | " + deliveryResult;
    }
}
