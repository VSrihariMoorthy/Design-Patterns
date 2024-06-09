public class StrategyPatternDemo {
    public static void main(String[] args) {
        Order order1 = new Order(100);
        order1.processOrder(new CreditCardPayment("John Doe", "1234567890123456", "786", "12/22"));

        Order order2 = new Order(200);
        order2.processOrder(new PayPalPayment("john@example.com", "mypassword"));

        Order order3 = new Order(300);
        order3.processOrder(new BitcoinPayment("1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa"));
    }
}
