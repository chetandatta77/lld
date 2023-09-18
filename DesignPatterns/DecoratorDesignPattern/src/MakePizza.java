import Base.BasePizza;
import Base.FarmHousePizza;
import Decorator.ExtraCheese;
import Decorator.Mushroom;

public class MakePizza {

    public static void main(String[] args) {
        BasePizza pizza = new FarmHousePizza();
        pizza = new Mushroom(new ExtraCheese(pizza));
        System.out.println(pizza.cost());
    }
}
