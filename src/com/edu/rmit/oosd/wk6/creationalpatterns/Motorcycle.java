package com.edu.rmit.oosd.wk6.creationalpatterns;

import com.edu.rmit.oosd.wk6.creationalpatterns.builder.vehicle.BuilderInterface;
import com.edu.rmit.oosd.wk6.creationalpatterns.builder.vehicle.Product;

public class Motorcycle implements BuilderInterface {

    private Product product = new Product();

    @Override
    public void buildBody() {
        product.add("This is the body of a motorcycle");
    }

    @Override
    public void insertWheels() {
        product.add("2 wheels are added");
    }

    @Override
    public void addHeadlights() {
        product.add("1 headlights are added");
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}
