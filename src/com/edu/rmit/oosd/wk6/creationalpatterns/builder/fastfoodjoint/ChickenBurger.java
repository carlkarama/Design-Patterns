package com.edu.rmit.oosd.wk6.creationalpatterns.builder.fastfoodjoint;

public class ChickenBurger implements ChickenBuilder<ChickenBurger> {

    private final MealProduct mealProduct = new MealProduct();

    public ChickenBurger() {

    }

    @Override
    public MealProduct getMeal() {
        return mealProduct;
    }

    @Override
    public ChickenBurger setCost(double cost) {
        this.mealProduct.addToMeal(Double.valueOf(cost).toString());
        return this;
    }

    @Override
    public ChickenBurger setName(String name) {
        this.mealProduct.addToMeal(name);
        return this;
    }

    @Override
    public ChickenBurger setQuantity(int quantity) {
        this.mealProduct.addToMeal(Integer.valueOf(quantity).toString());
        return this;
    }

    public ChickenBurger computeTotal(double cost, int quantity) {
        this.mealProduct.addToMeal(Double.valueOf(cost*quantity).toString());
        return this;
    }

    @Override
    public ChickenBurger wrapBurger(String wrapper) {
        this.mealProduct.addToMeal(wrapper);
        return this;
    }
}
