package ExpressionEvaluation;

public class Expression implements ArithmeticExpression{

    private Operation operation;
    private ArithmeticExpression leftExpression;
    private ArithmeticExpression rightExpression;

    public Expression(Operation operation, ArithmeticExpression leftExpression, ArithmeticExpression rightExpression) {
        this.operation = operation;
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public int evaluate() {
        int value = 0;

        switch (operation){
            case ADD -> {
                value += rightExpression.evaluate() + leftExpression.evaluate();
            }
            case SUBTRACT -> {
                value += rightExpression.evaluate() - leftExpression.evaluate();
            }
            case DIVIDE -> {
                value += rightExpression.evaluate() / leftExpression.evaluate();
            }
            case MULTIPLY -> {
                value += rightExpression.evaluate() * leftExpression.evaluate();
            }
        }
        System.out.println("Expression value is "+value);
        return value;
    }
}
