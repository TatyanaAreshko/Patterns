package Factory.vegankitchen;

import Factory.*;

public class VeganKitchenFactory implements AbstractFactory {
    @Override
    public Pizza getPizza() {
        return new VeganPizza();
    }

    @Override
    public Sushi getSushi() {
        return new VeganSushi();
    }
}
