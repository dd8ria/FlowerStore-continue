package ucu.edu.ua.flowershop.payment;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CreditCardPaymentStrategy implements Payment {

    private String cardNumber;
    private String cvv;
    private String expiryDate;
    private String cardHolderName;

    @Override
    public String pay(double price) {
        // In real life we’d call payment gateway here.
        return "Paid " + price + " using Credit Card (" + maskCardNumber() + ")";
    }

    private String maskCardNumber() {
        if (cardNumber == null || cardNumber.length() < 4) {
            return "****";
        }
        return "****-****-****-" + cardNumber.substring(cardNumber.length() - 4);
    }
}
