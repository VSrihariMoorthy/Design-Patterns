public class Order {
    private int amount;

    public Order(int amount) {
        this.amount = amount;
    }

    public void processOrder(PaymentStrategy paymentMethod) {
        paymentMethod.pay(amount);
    }
}
