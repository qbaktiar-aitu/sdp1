package PaymentSystem;

// ShoppingCart.java
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<String> items = new ArrayList<>();
    private double totalAmount = 0.0;
    private PaymentStrategy paymentStrategy;

    public void addItem(String item, double price) {
        items.add(item);
        totalAmount += price;
        System.out.println("Added " + item + " for $" + price);
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
        System.out.println("Payment strategy set to " + paymentStrategy.getClass().getSimpleName());
    }

    public void checkout() {
        if (paymentStrategy == null) {
            throw new IllegalStateException("Payment strategy not set");
        }
        System.out.println("Total amount to be paid: $" + totalAmount);
        paymentStrategy.pay(totalAmount);
        System.out.println("Payment successful!");
    }
}
