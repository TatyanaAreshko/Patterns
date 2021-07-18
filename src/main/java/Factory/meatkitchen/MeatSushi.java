package Factory.meatkitchen;

import Factory.Sushi;

public class MeatSushi implements Sushi {
    @Override
    public void make() {
        System.out.println("Повар готовит суши");
    }
}
