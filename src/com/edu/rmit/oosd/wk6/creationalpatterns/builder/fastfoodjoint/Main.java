package com.edu.rmit.oosd.wk6.creationalpatterns.builder.fastfoodjoint;

public class Main {
    /**
     * Director -- Manager
     * Product  -- Meal
     * Builder  -- Burger & Drink
     * |__Burger
     *    |__ Veggie Burger  -|
     *                        |- packaged in a wrapper
     *    |__ ChickenBurger Burger -|
     * |__ Cold Drink -|
     *    |__ Coke     |- packaged in a bottle
     *    |__ Pepsi   -|
     */
    public static void main(String[] args) {

        // Director
        Manager manager = new Manager("Carl Karama");

        // Order 1 builder (Staff)
        ChickenBuilder<ChickenBurger> chickenBuilder = new ChickenBurger()
                .setName("ChickenBurger Burger")
                .setCost(12.00)
                .wrapBurger("ChickenBurger Burger Wrapper")
                .setQuantity(3)
                .computeTotal(12,3);

        manager.serve(chickenBuilder);

        // Order 2 builder (Staff)
        VeggieBuilder<VeggieBurger> veggieBurgerBuilder = new VeggieBurger()
                .setName("Vegetable Burger")
                .setCost(15.00)
                .wrapBurger("ChickenBurger Burger Wrapper!")
                .setQuantity(2)
                .computeTotal(15, 2);

        manager.serve(veggieBurgerBuilder);

        MealProduct chickenMeal = chickenBuilder.getMeal();
        chickenMeal.display();

        MealProduct veggieMeal = veggieBurgerBuilder.getMeal();
        veggieMeal.display();


    }
}
