package ucu.edu.ua.flowershop.payment;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PayPalPaymentStrategy implements Payment {

    private String email;

    @Override
    public String pay(double price) {
        return "Paid " + price + " using PayPal account " + email;
    }
}
