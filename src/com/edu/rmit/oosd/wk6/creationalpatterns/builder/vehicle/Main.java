package com.edu.rmit.oosd.wk6.creationalpatterns.builder.vehicle;

public class Main {

    public static void main(String[] args) {

        Director director = new Director();

        BuilderInterface carBuilder = new Car();
        BuilderInterface motorcycleBuilder = new Motorcycle();

        director.construct(carBuilder);
        Product carProduct = carBuilder.getVehicle();
        carProduct.show();

        Product motorcycleProduct = motorcycleBuilder.getVehicle();
        director.construct(motorcycleBuilder);
        motorcycleProduct.show();

    }
}
