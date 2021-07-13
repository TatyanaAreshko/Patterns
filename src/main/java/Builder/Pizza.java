package Builder;

public class Pizza {
    private PizzaType type;
    private int flour;
    private int water;
    private Cheese cheese;
    private Sausage sausage;
    private Pineapple pineapple;
    private int size = 20;

    public Pizza(PizzaType type, int flour, int water, Cheese cheese, Sausage sausage, Pineapple pineapple) {
        this.type = type;
        this.flour = flour;
        this.water = water;
        this.cheese = cheese;
        this.sausage = sausage;
        this.pineapple = pineapple;
    }

    public PizzaType getType() {
        return type;
    }

    public int getFlour() {
        return flour;
    }

    public int getWater() {
        return water;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Cheese getCheese(){
        return cheese;
    }

    public Sausage getSausage(){
        return sausage;
    }

    public Pineapple getPineapple(){
        return pineapple;
    }

}
