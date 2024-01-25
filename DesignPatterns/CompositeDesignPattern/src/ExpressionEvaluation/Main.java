package ExpressionEvaluation;

public class Main {
    public static void main(String[] args) {

        ArithmeticExpression one = new Number(1);
        ArithmeticExpression two = new Number(2);
        ArithmeticExpression seven = new Number(7);

        ArithmeticExpression addExpression = new Expression(Operation.ADD, one, seven);
        ArithmeticExpression parentExpression = new Expression(Operation.MULTIPLY, two, addExpression);
        System.out.println(parentExpression.evaluate());
    }
}
