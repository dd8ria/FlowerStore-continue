package ucu.edu.ua.flowershop.delivery;

import ucu.edu.ua.flowershop.model.Item;
import flower.store.Flower;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class DHLDeliveryStrategyTest {

    @Test
    void deliverShouldMentionDHL() {
        Delivery delivery = new DHLDeliveryStrategy();

        Flower flower = new Flower();
        flower.setPrice(10.0);
        Item item = new Item(flower, 1);

        String result = delivery.deliver(List.of(item));
        assertTrue(result.contains("DHL"));
    }
}
