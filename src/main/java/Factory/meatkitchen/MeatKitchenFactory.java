package Factory.meatkitchen;

import Factory.AbstractFactory;
import Factory.Pizza;
import Factory.Sushi;

public class MeatKitchenFactory implements AbstractFactory {
    @Override
    public Pizza getPizza() {
        return new MeatPizza();
    }

    @Override
    public Sushi getSushi() {
        return new MeatSushi();
    }
}
