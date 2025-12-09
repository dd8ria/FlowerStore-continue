package ucu.edu.ua.flowershop.payment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class PayPalPaymentStrategyTest {

    @Test
    void payShouldReturnMessageWithEmail() {
        Payment payment = new PayPalPaymentStrategy("user@example.com");
        String result = payment.pay(50.0);
        assertTrue(result.contains("50.0"));
        assertTrue(result.contains("user@example.com"));
    }
}
