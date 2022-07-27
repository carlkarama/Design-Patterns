package com.edu.rmit.oosd.wk6.creationalpatterns.builder.fastfoodjoint;

public interface VeggieBuilder<T> extends MealBuilder<T> {

    @Override
    MealProduct getMeal();

    @Override
    T setCost(double cost);

    @Override
    T setName(String name);
}
