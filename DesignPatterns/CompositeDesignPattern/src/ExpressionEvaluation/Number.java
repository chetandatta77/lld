package ExpressionEvaluation;

public class Number implements ArithmeticExpression{

    private int value;

    public Number(int value) {
        this.value = value;
    }

    @Override
    public int evaluate() {
        System.out.println("Number Value is " + value);
        return value;
    }
}
