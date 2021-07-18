package Builder;

public class PizzaBuilder implements Builder{
    private PizzaType type;
    private int flour;
    private int water;
    private Cheese cheese;
    private Sausage sausage;
    private Pineapple pineapple;

    @Override
    public void setPizzaType(PizzaType type) {
        this.type = type;
    }

    @Override
    public void setFlour(int flour) {
        this.flour = flour;
    }

    @Override
    public void setWater(int water) {
        this.water = water;
    }

    @Override
    public void setСheese(Cheese cheese) {
        this.cheese = cheese;
    }

    @Override
    public void setSausage(Sausage sausage) {
        this.sausage = sausage;
    }

    @Override
    public void setPineapple(Pineapple pineapple) {
        this.pineapple = pineapple;
    }

    public Pizza getResult(){
        return new Pizza(type, flour, water, cheese, sausage, pineapple);
    }
}
