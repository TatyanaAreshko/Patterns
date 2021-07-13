package Builder;

public class Recipe {
    private PizzaType type;
    private int flour;
    private int water;
    private Cheese cheese;
    private Sausage sausage;
    private Pineapple pineapple;

    public Recipe(PizzaType type, int flour, int water, Cheese cheese, Sausage sausage, Pineapple pineapple) {
        this.type = type;
        this.flour = flour;
        this.water = water;
        this.cheese = cheese;
        this.sausage = sausage;
        this.pineapple = pineapple;
    }

    public String print(){
        String s = "";
        s += "Pizza type: " + type + "\n";
        s += "Count of flour: " + flour + "\n";
        s += "Count of water: " + water + "\n";
        if (this.cheese != null){
            s += "Type of cheese: " + cheese + "\n";
        }
        else {
            s += "Type of cheese: no cheese " + "\n";
        }
        if (this.sausage != null){
            s += "Type of sausage: " + sausage + "\n";
        }
        else {
            s += "Type of sausage: no sausage " + "\n";
        }
        if (this.pineapple != null){
            s += "Type of pineapple: " + pineapple + "\n";
        }
        else {
            s += "Type of pineapple: no pineapple " + "\n";
        }
       return s;
    }
}
