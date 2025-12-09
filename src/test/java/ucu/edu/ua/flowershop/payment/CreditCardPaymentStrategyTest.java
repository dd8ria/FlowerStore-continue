package ucu.edu.ua.flowershop.payment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class CreditCardPaymentStrategyTest {

    @Test
    void payShouldReturnMessageWithAmount() {
        Payment payment = new CreditCardPaymentStrategy(
                "1234567812345678", "123", "12/28", "Alice"
        );
        String result = payment.pay(100.0);
        assertTrue(result.contains("100.0"));
        assertTrue(result.contains("Credit Card"));
    }
}
