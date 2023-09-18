package Decorator;

import Base.BasePizza;

public class ExtraCheese extends ToppingsDecorator{

    private BasePizza pizza;

    public ExtraCheese(BasePizza pizza){
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return pizza.cost() + 10;
    }
}
