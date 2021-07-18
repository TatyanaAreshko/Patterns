package Builder;

public class Runner {
    public static void main(String[] args) {
        Cook cook = new Cook();
        PizzaBuilder builder = new PizzaBuilder();
        cook.makePizza1(builder);

        Pizza pizza = builder.getResult();
        System.out.println("Pizza is making: \n" + pizza.getType() + "\n");

        PizzaRecipeBuilder recipeBuilder = new PizzaRecipeBuilder();

        cook.makePizza1(recipeBuilder);
        Recipe recipe = recipeBuilder.getResult();
        System.out.println(recipe.print());
    }
}
