package com.edu.rmit.oosd.wk6.creationalpatterns.builder.fastfoodjoint;

public interface ItemInterface<T> {

    public T setCost(double cost);

    public T setName(String name);

    public T setQuantity(int quantity);
}
