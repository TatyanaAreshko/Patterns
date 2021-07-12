package Factory;

import Factory.meatkitchen.MeatKitchenFactory;

public class RestoranThreePigs {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new MeatKitchenFactory();
        Pizza pizza = abstractFactory.getPizza();
        Sushi sushi = abstractFactory.getSushi();

        System.out.println("Нарезаем колбасу...");
        pizza.bake();
        sushi.make();

    }
}
