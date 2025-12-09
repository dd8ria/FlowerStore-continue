package ucu.edu.ua.flowershop.controller;

import ucu.edu.ua.flowershop.delivery.DHLDeliveryStrategy;
import ucu.edu.ua.flowershop.delivery.PostDeliveryStrategy;
import ucu.edu.ua.flowershop.model.Item;
import ucu.edu.ua.flowershop.model.Order;
import ucu.edu.ua.flowershop.payment.CreditCardPaymentStrategy;
import ucu.edu.ua.flowershop.payment.PayPalPaymentStrategy;
import flower.store.Flower;
import flower.store.FlowerColor;
import flower.store.FlowerType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private Flower sampleFlower() {
        Flower flower = new Flower();
        flower.setSepalLength(5.0);
        flower.setColor(FlowerColor.RED);
        flower.setPrice(25.0);
        flower.setFlowerType(FlowerType.ROSE);
        return flower;
    }

    @GetMapping("/credit-card-post")
    public String orderWithCreditCardAndPost() {
        Order order = new Order();
        order.addItem(new Item(sampleFlower(), 3));

        order.setPayment(new CreditCardPaymentStrategy(
                "1234567812345678", "123", "12/28", "Alice"
        ));
        order.setDelivery(new PostDeliveryStrategy());

        return order.processOrder();
    }

    @GetMapping("/paypal-dhl")
    public String orderWithPayPalAndDHL() {
        Order order = new Order();
        order.addItem(new Item(sampleFlower(), 2));

        order.setPayment(new PayPalPaymentStrategy("user@example.com"));
        order.setDelivery(new DHLDeliveryStrategy());

        return order.processOrder();
    }
}
