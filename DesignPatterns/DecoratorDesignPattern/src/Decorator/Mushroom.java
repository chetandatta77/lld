package Decorator;

import Base.BasePizza;

public class Mushroom extends ToppingsDecorator{

    private BasePizza pizza;

    public Mushroom(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return pizza.cost()+20;
    }
}
