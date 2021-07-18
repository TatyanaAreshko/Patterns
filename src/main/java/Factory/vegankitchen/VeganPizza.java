package Factory.vegankitchen;

import Factory.Pizza;

public class VeganPizza implements Pizza {
    @Override
    public void bake() {
        System.out.println("Повар готовит пиццу");
    }


}
