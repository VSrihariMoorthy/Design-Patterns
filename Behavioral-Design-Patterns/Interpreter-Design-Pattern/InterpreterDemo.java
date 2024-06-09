public class InterpreterDemo {
    public static void main(String[] args) {
        // (5 + 3) - (2 + 1)
        Expression five = new Number(5);
        Expression three = new Number(3);
        Expression two = new Number(2);
        Expression one = new Number(1);

        Expression addition1 = new Addition(five, three); // (5 + 3)
        Expression addition2 = new Addition(two, one);    // (2 + 1)

        Expression result = new Subtraction(addition1, addition2); // (5 + 3) - (2 + 1)
        System.out.println("(5 + 3) - (2 + 1) = " + result.interpret());
    }
}
