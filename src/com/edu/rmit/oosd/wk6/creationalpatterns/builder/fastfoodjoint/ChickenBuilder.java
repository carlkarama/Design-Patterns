package com.edu.rmit.oosd.wk6.creationalpatterns.builder.fastfoodjoint;

public interface ChickenBuilder<T> extends MealBuilder<T> {

    @Override
    public T wrapBurger(String wrapper);

    @Override
    public MealProduct getMeal();

    @Override
    public T setCost(double cost);

    @Override
    public T setName(String name);

    @Override
    T setQuantity(int quantity);
}
