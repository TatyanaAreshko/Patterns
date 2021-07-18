package Factory.meatkitchen;

import Factory.Pizza;

public class MeatPizza implements Pizza {
    @Override
    public void bake() {
        System.out.println("Повар готовит пиццу");
    }


}
