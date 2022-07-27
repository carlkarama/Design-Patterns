package com.edu.rmit.oosd.wk6.creationalpatterns.builder.fastfoodjoint;

import java.util.ArrayList;
import java.util.List;

public class MealProduct {

    private List<String> meals = new ArrayList<>();

    public void addToMeal(String meal) {
        this.meals.add(meal);
    }

    public void display() {
        System.out.println(meals.toString());
    }
}
