package PaymentSystem;

// Main.java
public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Book", 29.99);
        cart.addItem("Headphones", 99.99);

        // User chooses to pay with Credit Card
        PaymentStrategy creditCard = new CreditCardPayment(
                "1234-5678-9012-3456", "John Doe", "123", "12/25"
        );
        cart.setPaymentStrategy(creditCard);
        cart.checkout();

        System.out.println("\n--- New Transaction ---\n");

        // Another user chooses to pay with PayPal
        PaymentStrategy paypal = new PayPalPayment(
                "jane.doe@example.com", "securepassword"
        );
        cart.setPaymentStrategy(paypal);
        cart.checkout();

        System.out.println("\n--- New Transaction ---\n");

        // Another user chooses to pay with Bitcoin
        PaymentStrategy bitcoin = new BitcoinPayment("1BoatSLRHtKNngkdXEeobR76b53LETtpyT");
        cart.setPaymentStrategy(bitcoin);
        cart.checkout();
    }
}
