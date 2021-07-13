package Builder;

public class Cook {

    public void makePizza1(Builder builder){
        builder.setPizzaType(PizzaType.CARBONARA);
        builder.setFlour(100);
        builder.setWater(50);
        builder.setСheese(Cheese.MOZZARELLA);
        builder.setSausage(Sausage.SALAMI);
        builder.setPineapple(Pineapple.FRESH);
    }

    public void makePizza2(Builder builder){
        builder.setPizzaType(PizzaType.MEAT);
        builder.setFlour(100);
        builder.setWater(50);
        builder.setСheese(Cheese.BRIE);
        builder.setSausage(Sausage.BRATWURST);
    }

}
