package com.edu.rmit.oosd.wk6.creationalpatterns.builder.fastfoodjoint;

public interface MealBuilder<T> extends ItemInterface<T> {

    public T wrapBurger(String wrapper);

    public MealProduct getMeal();

    @Override
    T setCost(double cost);

    @Override
    T setName(String name);

    @Override
    T setQuantity(int quantity);
}
