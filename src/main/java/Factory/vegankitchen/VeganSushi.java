package Factory.vegankitchen;

import Factory.Sushi;

public class VeganSushi implements Sushi {
    @Override
    public void make() {
        System.out.println("Повар готовит суши");
    }
}
