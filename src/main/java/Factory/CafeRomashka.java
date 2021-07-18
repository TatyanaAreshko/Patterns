package Factory;

import Factory.vegankitchen.VeganKitchenFactory;

public class CafeRomashka {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new VeganKitchenFactory();
        Pizza pizza = abstractFactory.getPizza();
        Sushi sushi = abstractFactory.getSushi();

        System.out.println("Крошим огурчики...");
        pizza.bake();
        sushi.make();
    }
}
