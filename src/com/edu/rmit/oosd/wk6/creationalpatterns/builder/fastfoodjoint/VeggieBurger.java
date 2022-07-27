package com.edu.rmit.oosd.wk6.creationalpatterns.builder.fastfoodjoint;

public class VeggieBurger implements VeggieBuilder<VeggieBurger> {

    private final MealProduct mealProduct = new MealProduct();

    public VeggieBurger() {

    }

    @Override
    public VeggieBurger wrapBurger(String wrapper) {
        this.mealProduct.addToMeal(wrapper);
        return this;
    }

    @Override
    public MealProduct getMeal() {
        return this.mealProduct;
    }

    @Override
    public VeggieBurger setCost(double cost) {
        this.mealProduct.addToMeal(Double.valueOf(cost).toString());
        return this;
    }

    public MealProduct getMealProduct() {
        return mealProduct;
    }

    @Override
    public VeggieBurger setName(String name) {
        this.mealProduct.addToMeal(name);
        return this;
    }

    public VeggieBurger computeTotal(int cost, int quantity) {
        this.mealProduct.addToMeal(Double.valueOf(cost*quantity).toString());
        return this;
    }

    @Override
    public VeggieBurger setQuantity(int quantity) {
        this.mealProduct.addToMeal(Integer.valueOf(quantity).toString());
        return this;
    }
}
