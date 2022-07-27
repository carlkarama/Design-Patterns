package com.edu.rmit.oosd.wk6.creationalpatterns.builder.fastfoodjoint;

public class Manager {

    private String name;
    private MealBuilder mealBuilder;

    public Manager(String name) {
        this.name = name;
    }

    public void serve(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MealBuilder getMealBuilder() {
        return mealBuilder;
    }

    public void setMealBuilder(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }
}
